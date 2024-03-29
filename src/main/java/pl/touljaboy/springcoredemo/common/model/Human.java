package pl.touljaboy.springcoredemo.common.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
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
