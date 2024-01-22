package pl.touljaboy.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.touljaboy.springcoredemo.common.model.Animal;

@RestController
public class DemoController {

    private Animal customAnimal;
    private Animal humanoidAnimal;

   @Autowired
    public DemoController(Animal theAnimal, @Qualifier("human") Animal theHumanoid) {
       System.out.println("In construction: " + getClass().getSimpleName());
        customAnimal = theAnimal;
        humanoidAnimal = theHumanoid;
    }
    /*
    @Autowired
    public void setAnimal(Animal theAnimal) {
        customAnimal=theAnimal;
    }
    */
    @GetMapping("/animalSound")
    public String getAnimalSound() {
        return "Rat sound: "+customAnimal.makeSound()+" lol 123\n"+"Human sound: "+humanoidAnimal.makeSound();
    }
}
