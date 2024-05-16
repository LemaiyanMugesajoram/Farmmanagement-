package Farm.Management.Plants;

import java.util.List;


public interface PlantsService {
    void savePlant(Plants plant);
    List<Plants> getAllPlants();
}
