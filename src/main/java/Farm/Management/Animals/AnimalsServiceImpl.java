package Farm.Management.Animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalsServiceImpl implements AnimalsService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public void saveAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    @Override
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public Animal getAnimalById(Long id) {
        Optional<Animal> animal = animalRepository.findById(id);
        return animal.orElse(null);
    }

    @Override
    public void updateAnimal(Long id, Animal animalDetails) {
        Optional<Animal> optionalAnimal = animalRepository.findById(id);
        if (optionalAnimal.isPresent()) {
            Animal animal = optionalAnimal.get();
            animal.setAnimalSex(animalDetails.getAnimalSex());
            animal.setBirthdayDate(animalDetails.getBirthdayDate());
            animal.setFamilyNo(animalDetails.getFamilyNo());
            animal.setInseminationDate(animalDetails.getInseminationDate());
            animal.setAnimalBreeding(animalDetails.getAnimalBreeding());
            animal.setAnimalHealth(animalDetails.getAnimalHealth());
            animal.setAnimalFeeding(animalDetails.getAnimalFeeding());
            animal.setAnimalFeedingRationing(animalDetails.getAnimalFeedingRationing());
            animal.setAnimalProduction(animalDetails.getAnimalProduction());
            animal.setAnimalMovements(animalDetails.getAnimalMovements());
            animal.setAnimalBehavior(animalDetails.getAnimalBehavior());
            animal.setDate(animalDetails.getDate());
            animalRepository.save(animal);
        }
    }

    @Override
    public void deleteAnimal(Long id) {
        if (animalRepository.existsById(id)) {
            animalRepository.deleteById(id);
        }
    }
}
