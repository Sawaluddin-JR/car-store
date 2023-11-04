package com.store.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.models.User;

@Service
public class UserService {
    private List<User> listUser = new ArrayList<>();

    public List<User> getAllUser() {
        return listUser;
    }

    public void addUser(User user) {
        listUser.add(user);
    }

    public void initializeUsers() {
        User user1 = new User(1, "Syawaluddin", 18, "Sidimpuan", "USERS");
        User user2 = new User(2, "Ali Hanafiah", 19, "Banten", "ADMIN");
        User user3 = new User(3, "Dede Adam", 20, "Banjarsari", "USERS");

        addUser(user1);
        addUser(user2);
        addUser(user3);
    }
}
