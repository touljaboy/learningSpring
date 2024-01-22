package pl.touljaboy.springcoredemo.common.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Human implements Animal{

    public Human() {
        System.out.println("In construction: " + getClass().getSimpleName());
    }
    @Override
    public String makeSound() {
        return "I know that I know nothing (about programming)";
    }
}
