package com.beverage.store.repository;

import com.beverage.store.model.Bottle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BottleRepository extends CrudRepository<Bottle, Long> {
}
