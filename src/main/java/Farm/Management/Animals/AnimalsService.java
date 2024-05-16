package Farm.Management.Animals;

import java.util.List;

public interface AnimalsService {
    void saveAnimal(Animals animal);

    List<Animals> getAllAnimals();


}
