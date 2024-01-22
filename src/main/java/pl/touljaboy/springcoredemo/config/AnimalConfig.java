package pl.touljaboy.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.touljaboy.springcoredemo.common.model.Animal;
import pl.touljaboy.springcoredemo.common.model.Hamster;

@Configuration
public class AnimalConfig {

    @Bean("weirdLookingRat")
    public Animal hamster() {
        return new Hamster();
    }
}
