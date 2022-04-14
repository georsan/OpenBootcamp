package com.OpenBootcamp.Ordenadores.Controller;

import com.OpenBootcamp.Ordenadores.Entities.Laptop;
import com.OpenBootcamp.Ordenadores.Repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    LaptopRepository laptop;

    public LaptopController(LaptopRepository laptop) {
        this.laptop = laptop;
    }
    @GetMapping("/Laptops")
    public List<Laptop>laptops( ){
        return laptop.findAll();
    }
    @PostMapping("/Laptops")
    public ResponseEntity<Laptop> save(@RequestBody Laptop lapto){
        laptop.save(lapto);
        return ResponseEntity.ok().build();
    }


}
