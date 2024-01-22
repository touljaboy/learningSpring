package pl.touljaboy.springcoredemo.util.model;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public String makeSound() {
        return "Bark";
    }
}
