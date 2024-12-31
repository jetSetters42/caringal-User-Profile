package com.caringal.activity_userprofile.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
