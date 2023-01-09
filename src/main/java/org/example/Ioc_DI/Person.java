package org.example.Ioc_DI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Person {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Pet getPet() {
        return pet;
    }

    @PostConstruct
    public void init() {
        System.out.println("Person Init Method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Person Destroy Method");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
