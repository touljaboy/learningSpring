package pl.touljaboy.springcoredemo.util.model;

import org.springframework.stereotype.Component;

@Component
public class Human implements Animal{
    @Override
    public String makeSound() {
        return "I know that I know nothing (about programming)";
    }
}
