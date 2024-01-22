package pl.touljaboy.springcoredemo.common.model;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    public Dog() {
        System.out.println("In construction: " + getClass().getSimpleName());
    }
    @Override
    public String makeSound() {
        return "Bark";
    }
}
