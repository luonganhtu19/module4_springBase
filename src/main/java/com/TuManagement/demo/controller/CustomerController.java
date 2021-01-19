package com.TuManagement.demo.controller;

import com.TuManagement.demo.service.Customer;
import com.TuManagement.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private  CustomerService customerService;
//    private static

    @GetMapping("/customers")
    public ModelAndView showList() {
        List<Customer> customers= customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    //    @GetMapping("/customers")
//    public ModelAndView showInfo(@RequestParam("action") String action,@RequestParam("id") Long id){
//
//    }
    // <a href="/customers?action=show&&id=${customer.getId()}">${customer.name}</a>
    @GetMapping("/show/{id}")
    public ModelAndView showInfo(@PathVariable Long id) {
        Customer customer = null;
        List<Customer> customers= customerService.findAll();
        for (Customer c : customers) {
            if (c.getId() == id) {
                customer = c;
                break;
            }
        }
        ModelAndView modelAndView = new ModelAndView("info");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
