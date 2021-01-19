package com.TuManagement.demo.service;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceFactory implements CustomerService {
    public static List<Customer> customers=new ArrayList<>();
    static {
        customers.add(new Customer(1,"phong","phong@123","anhvu"));
        customers.add(new Customer(2,"phong1","phong@1234","anhvu1"));
        customers.add(new Customer(3,"phong2","phong@1235","anhvu2"));
        customers.add(new Customer(4,"phong3","phong@1236","anhvu3"));
    }
    public  List<Customer>  findAll(){
        return customers;
    }
}
