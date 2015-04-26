package de.traveltotal.service;

import com.google.common.base.Optional;
import de.traveltotal.domain.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserService {

    @Inject
    UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAllUser();
    }

    public Optional<User> findUser(String lastname) {
        return userRepository.findUser(lastname);
    }
}
