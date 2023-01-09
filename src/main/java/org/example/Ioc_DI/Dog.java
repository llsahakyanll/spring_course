package org.example.Ioc_DI;

import org.springframework.beans.factory.annotation.Value;

//@Component("dogBean")
//@Scope("singleton")
public class Dog implements Pet{

    @Value("${dog.name}")
    private String name;

    @Value("${dog.age}")
    private int age;

    @Override
    public void say() {
        System.out.println("Dex-Dex");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
