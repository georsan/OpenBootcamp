package com.OpenBootcamp.Ordenadores.Controller;

import com.OpenBootcamp.Ordenadores.Entities.Laptop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {
  /*
    private TestRestTemplate testRestTemplate;
    @Autowired
    private RestTemplateBuilder testBuilder;
    @LocalServerPort
    private int port;
    @BeforeEach
    void setUp(){
        testBuilder = new RestTemplateBuilder().rootUri("http://localhost:" + port);
        testRestTemplate=new TestRestTemplate(testBuilder);
    }


    @Test
    void findAll() {
        ResponseEntity<Laptop[]>response=testRestTemplate.getForEntity("/Laptops",Laptop[].class);
        assertEquals(HttpStatus.OK,response.getStatusCode());

    }

    @Test
    void findOneById() {
        ResponseEntity<Laptop[]>response=testRestTemplate.getForEntity("/Laptops",Laptop[].class);
        assertEquals(HttpStatus.NOT_FOUND,response.getStatusCode());
    }
*/


}