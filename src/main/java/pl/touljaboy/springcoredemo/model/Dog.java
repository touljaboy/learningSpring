package pl.touljaboy.springcoredemo.model;

import org.springframework.stereotype.Component;
import pl.touljaboy.springcoredemo.model.Animal;

@Component
public class Dog implements Animal {
    @Override
    public String makeSound() {
        return "Bark";
    }
}
