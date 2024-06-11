package Farm.Management.Animals;

import java.util.List;

public interface AnimalsService {
    void saveAnimal(Animal animal);
    List<Animal> getAllAnimals();
    Animal getAnimalById(Long id);
    void updateAnimal(Long id, Animal animalDetails);
    void deleteAnimal(Long id);
}
