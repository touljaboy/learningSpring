package pl.touljaboy.springcoredemo.common.model;

import org.springframework.context.annotation.Bean;


public class Hamster implements Animal{

    public Hamster() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String makeSound() {
        return "tirle tirle";
    }
}
