package com.OpenBootcamp.Ordenadores;

import com.OpenBootcamp.Ordenadores.Entities.Laptop;
import com.OpenBootcamp.Ordenadores.Repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrdenadoresApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(OrdenadoresApplication.class, args);
		LaptopRepository repository=context.getBean(LaptopRepository.class);

		Laptop dell=new Laptop(null,"Dell nitro","Dell",50.0);
		Laptop apple=new Laptop(null,"Macbook pro","apple",500.0);
		repository.save(dell);
		repository.save(apple);




	}

}
