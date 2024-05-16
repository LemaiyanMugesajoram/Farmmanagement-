package Farm.Management.Animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/animals")
public class AnimalsController {

    @Autowired
    private AnimalsService animalsService;

    @PostMapping("/save")
    public ResponseEntity<String> saveAnimal(@RequestBody Animals animal) {
        animalsService.saveAnimal(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body("Animal saved successfully");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Animals>> getAllAnimals() {
        List<Animals> allAnimals = animalsService.getAllAnimals();
        return ResponseEntity.ok(allAnimals);
    }
}
