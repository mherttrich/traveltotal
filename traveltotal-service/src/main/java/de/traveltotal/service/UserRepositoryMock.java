package de.traveltotal.service;


import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import de.traveltotal.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class UserRepositoryMock implements UserRepository {
    private static final Logger LOG = LoggerFactory.getLogger(UserRepositoryMock.class);

    private List<User> allUser = Lists.newArrayList();

    public UserRepositoryMock(Resource csvRepo) throws IOException {

        try (InputStream is = csvRepo.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is));
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] u = line.split(";");
                allUser.add(new User.UserBuilder(u[1], u[2])
                        .street(u[3])
                        .zipCode(u[4])
                        .city(u[5])
                        .phone(u[6])
                        .age(Integer.valueOf(u[8]))
                        .build());
            }
        }
    }

    @Override
    public List<User> findAllUser() {
        return allUser;
    }

    @Override
    public Optional<User> findUser(String lastName) {
        for (User user : allUser) {
            if (user.getLastName().equals(lastName)) {
                return Optional.of(user);
            }
        }

        return Optional.absent();
    }
}
