package de.traveltotal.service;

import de.traveltotal.domain.User;

import java.util.List;

public interface UserRepository {

    public List<User> findAllUser();

    public List<User> findAllUser(String lastName);
}
