package com.marek.dog_rental.repositories;

import com.marek.dog_rental.entities.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {

}
