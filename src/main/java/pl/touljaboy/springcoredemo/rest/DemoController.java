package pl.touljaboy.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.touljaboy.springcoredemo.util.model.Animal;

@RestController
public class DemoController {

    private Animal customAnimal;

   /* @Autowired
    public DemoController(Animal theAnimal) {
        customAnimal = theAnimal;
    }
    */
    @Autowired
    public void setAnimal(Animal theAnimal) {
        customAnimal=theAnimal;
    }

    @GetMapping("/animalSound")
    public String getAnimalSound() {
        return customAnimal.makeSound()+" lol 123";
    }
}
