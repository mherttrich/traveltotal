package de.traveltotal.service;

import de.traveltotal.domain.User;

import java.util.List;

public interface UserRepository {

    public List<User> findAllUser();

    public User findUser(String lastName);
}
