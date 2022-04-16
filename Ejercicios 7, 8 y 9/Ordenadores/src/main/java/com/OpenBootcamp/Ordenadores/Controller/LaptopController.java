package com.OpenBootcamp.Ordenadores.Controller;

import com.OpenBootcamp.Ordenadores.Entities.Laptop;
import com.OpenBootcamp.Ordenadores.Repository.LaptopRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    LaptopRepository laptop;
    private final Logger log=LoggerFactory.getLogger(Laptop.class);
    public LaptopController(LaptopRepository laptop) {
        this.laptop = laptop;
    }
    //findAll
    @GetMapping("/Laptops")
    public List<Laptop>findAll( ){

        return laptop.findAll();
    }
    //findOneById
    @GetMapping("/Laptops/{id}")
    public Optional<Laptop> findOneById(@PathVariable Long id){

        return laptop.findById(id);
    }
    //Create
    @PostMapping("/Laptops")
    public ResponseEntity<Laptop> Create(@RequestBody Laptop lapto){
        if (lapto.getId()!=null){
            log.warn("Estas creando un libro con Id");
            return ResponseEntity.badRequest().build();
        }
        laptop.save(lapto);
        return ResponseEntity.ok().build();
    }
    //Update
    @PutMapping("/Laptops")
    public ResponseEntity<Laptop>Update(@RequestBody Laptop lapto) {
        if (lapto.getId() == null) {
            log.warn("Estas actualizando un libro que no existe");
            return ResponseEntity.badRequest().build();
        } else if (!laptop.existsById(lapto.getId())) {
            log.warn("Estas actualizando un libro que no existe");
            return ResponseEntity.notFound().build();
        } else {
            Laptop response = laptop.save(lapto);
            return ResponseEntity.ok(response);
        }
    }
    @DeleteMapping("/Laptops/{id}")
    public ResponseEntity<Laptop>Delete(@PathVariable Long id){
        if (!laptop.existsById(id)){
            log.warn("Estas actualizando un libro que no existe");
            return ResponseEntity.notFound().build();
        }
        else{
            laptop.deleteById(id);
            return ResponseEntity.noContent().build();
        }

    }
    @DeleteMapping("/Laptops")
    public ResponseEntity<Laptop>Delete(){

            laptop.deleteAll();
            return ResponseEntity.noContent().build();


    }

}


