package Farm.Management.Animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalsServiceImpl implements AnimalsService {

    @Autowired
    private AnimalsRepository animalsRepository; // Assuming you have a repository for Animals

    @Override
    public void saveAnimal(Animals animal) {
        animalsRepository.save(animal);
    }

    @Override
    public List<Animals> getAllAnimals() {
        return animalsRepository.findAll();
    }
}
