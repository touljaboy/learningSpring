package pl.touljaboy.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.touljaboy.springcoredemo.common.model.Animal;

@RestController
public class DemoController {

    private Animal customAnimal;
    private Animal anotherAnimal;

   @Autowired
    public DemoController(
            @Qualifier("human") Animal theAnimal,
            @Qualifier("human") Animal theanotherAnimal) {
       System.out.println("In construction: " + getClass().getSimpleName());
        customAnimal = theAnimal;
        anotherAnimal = theanotherAnimal;
        //Singleton, so it will refer to the same bean
    }
    /*
    @Autowired
    public void setAnimal(Animal theAnimal) {
        customAnimal=theAnimal;
    }
    */
    @GetMapping("/animalSound")
    public String getAnimalSound() {
        return "Rat sound: "+customAnimal.makeSound()+" lol 123\n"+"Human sound: "+anotherAnimal.makeSound();
    }

    @GetMapping("/check")
    public String check(){
        //Singleton will return true (the same bean)
        //Prototype will return false (different beans)
        return "Are both animals equal? : " + (customAnimal==anotherAnimal);
    }
}
