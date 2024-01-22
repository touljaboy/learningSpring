package pl.touljaboy.springcoredemo.common.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Rat implements Animal{

    public Rat() {
        System.out.println("In construction: " + getClass().getSimpleName());
    }
    @Override
    public String makeSound() {
        return "metroslapka";
    }
}
