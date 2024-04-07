package ru.dunaf.execution_time.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dunaf.execution_time.annotation.TrackTime;
import ru.dunaf.execution_time.entity.Animal;
import ru.dunaf.execution_time.service.AnimalService;

import java.util.List;


@RestController
@RequestMapping("/animal")
public class AnimalController {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    private final AnimalService service;


    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping("/all")
    @TrackTime
    public List<Animal> getAll() {
        log.info("getAll");
        return service.getAll();
    }
}
