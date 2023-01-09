package org.example.Ioc_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan
@PropertySource("classpath:application.properties")
public class MyConfig {
    @Bean
    public Person personBean() {
        return new Person(dogBean());

    }

    @Bean
    public Cat catBean() {
        return new Cat();
    }

    @Bean
    public Dog dogBean() {
        return new Dog();
    }
}
