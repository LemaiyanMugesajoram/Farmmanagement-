package Farm.Management.Plants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/plants")
public class PlantsController {

    @Autowired
    private PlantsService plantsService;

    @PostMapping("/plants/save")
    public void savePlant(@RequestBody Plants plant) {
        plantsService.savePlant(plant);
    }

    @GetMapping("/all")
    public List<Plants> getAllPlants() {
        return plantsService.getAllPlants();
    }
}
