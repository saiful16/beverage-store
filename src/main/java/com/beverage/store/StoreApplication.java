package com.beverage.store;

import com.beverage.store.model.Bottle;
import com.beverage.store.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	private void createBottle() {
//		this.name = name;
//		this.bottlePic = bottlePic;
//		this.volume = volume;
//		this.alcoholic = alcoholic;
//		this.volumePercent = volumePercent;
//		this.price = price;
//		this.supplier = supplier;
//		this.inStock = inStock;
		Bottle bottle = new Bottle(
				"Pepsi",
				"photourl",
				100,
				true,
				30,
				20,
				"DD",
				10
		);
		bottleService.create(bottle);

	}

	@Autowired
	private BottleService bottleService;

	@Override
	public void run(String... args) throws Exception {

	}
}
