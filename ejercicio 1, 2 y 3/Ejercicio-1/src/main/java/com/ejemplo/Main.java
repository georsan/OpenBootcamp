package com.ejemplo;

import com.ejemplo.Saludo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo sa= (Saludo) context.getBean("Saludo");
        System.out.println(sa.imprimirSaludo());
    }
}
