import com.TuManagement.demo.service.Customer;
import com.TuManagement.demo.service.CustomerService;
import com.TuManagement.demo.service.CustomerServiceFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("com.TuManagement.demo")
public class AppConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {
     private ApplicationContext applicationContext;
     @Override
     public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
         this.applicationContext=applicationContext;
     }

     @Bean
     public ViewResolver viewResolver(){
         InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
         viewResolver.setPrefix("/customers/");
         viewResolver.setSuffix(".jsp");
         return viewResolver;
     }
     @Bean
    public CustomerService customerService(){
         return new CustomerServiceFactory();
    }
}

