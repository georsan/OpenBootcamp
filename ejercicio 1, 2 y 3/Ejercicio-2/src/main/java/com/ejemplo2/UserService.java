package com.ejemplo2;

import org.springframework.stereotype.Component;

@Component
public class UserService{
    NotificationService notify;

    public UserService(NotificationService notify) {
        this.notify = notify;
    }

}
