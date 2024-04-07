package ru.dunaf.execution_time.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dunaf.execution_time.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
