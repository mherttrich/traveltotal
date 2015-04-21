package de.traveltotal.service;

import de.traveltotal.domain.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserService {

    @Inject
    UserRepository userRepository;

    public List<User> assembleAll() {
        return userRepository.findAllUser();
    }
}
