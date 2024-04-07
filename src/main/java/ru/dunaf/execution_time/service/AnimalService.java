package ru.dunaf.execution_time.service;

import org.springframework.stereotype.Service;
import ru.dunaf.execution_time.entity.Animal;
import ru.dunaf.execution_time.repository.AnimalRepository;

import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public List<Animal> getAll() {
        return repository.findAll();
    }
}
