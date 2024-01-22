package pl.touljaboy.springcoredemo.util.model;

import org.springframework.stereotype.Component;

@Component
public class Rat implements Animal{
    @Override
    public String makeSound() {
        return "metroslapka";
    }
}
