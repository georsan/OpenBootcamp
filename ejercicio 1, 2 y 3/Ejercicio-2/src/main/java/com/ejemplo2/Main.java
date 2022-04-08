package com.ejemplo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service= (UserService) context.getBean(UserService.class);
        System.out.println(service.notify.imprimirSaludo());
    }
}
