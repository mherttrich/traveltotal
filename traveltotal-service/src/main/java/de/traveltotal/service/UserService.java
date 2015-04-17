package de.traveltotal.service;

import de.traveltotal.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User assembleAll() {
        return new User.UserBuilder("Hans", "Meier").address("nicolaistrasse").age(33).build();
    }
}
