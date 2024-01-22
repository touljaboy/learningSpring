package pl.touljaboy.springcoredemo.common.model;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{

    public Cat() {
        System.out.println("In construction: " + getClass().getSimpleName());
    }
    @Override
    public String makeSound() {
        return "meow";
    }
}
