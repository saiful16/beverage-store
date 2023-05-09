package com.beverage.store.service;

import com.beverage.store.model.Bottle;
import com.beverage.store.repository.BottleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BottleService {

    private BottleRepository bottleRepository;

    public BottleService(BottleRepository bottleRepository) {
        this.bottleRepository = bottleRepository;
    }

    public List<Bottle> getAll(){
        return (List<Bottle>) bottleRepository.findAll();
    }

    public Bottle create(Bottle bottle){
        return bottleRepository.save(bottle);
    }
}
