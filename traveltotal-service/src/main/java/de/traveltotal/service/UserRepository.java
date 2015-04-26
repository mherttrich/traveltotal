package de.traveltotal.service;

import com.google.common.base.Optional;
import de.traveltotal.domain.User;

import java.util.List;

public interface UserRepository {

    public List<User> findAllUser();

    public Optional<User> findUser(String lastName);
}
