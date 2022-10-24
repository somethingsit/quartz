package com.example.quartz.service.impl;

import com.example.quartz.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void handleUser() {
        System.out.print("*****HANDLE USER*****");
    }
}
