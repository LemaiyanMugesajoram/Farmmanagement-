package Farm.Management.Animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/animals")
public class AnimalController {

    @Autowired
    private AnimalsService animalsService;

    @PostMapping("/save")
    public ResponseEntity<Animal> createAnimal(@RequestBody Animal animal) {
        animalsService.saveAnimal(animal);
        return new ResponseEntity<>(animal, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals() {
        List<Animal> animals = animalsService.getAllAnimals();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Long id) {
        Animal animal = animalsService.getAnimalById(id);
        if (animal != null) {
            return new ResponseEntity<>(animal, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Animal> updateAnimal(@PathVariable Long id, @RequestBody Animal animalDetails) {
        Animal existingAnimal = animalsService.getAnimalById(id);
        if (existingAnimal != null) {
            animalsService.updateAnimal(id, animalDetails);
            Animal updatedAnimal = animalsService.getAnimalById(id);
            return new ResponseEntity<>(updatedAnimal, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable Long id) {
        Animal existingAnimal = animalsService.getAnimalById(id);
        if (existingAnimal != null) {
            animalsService.deleteAnimal(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
