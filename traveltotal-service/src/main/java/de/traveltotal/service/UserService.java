package de.traveltotal.service;

import com.google.common.collect.Lists;
import de.traveltotal.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    //currently just a mock

    public List<User> assembleAll() {
        List user = Lists.newArrayList();
        user.add(new User.UserBuilder("Hans", "Meier")
                .street("Nicolaistrasse 12")
                .city("Berlin")
                .phone("0179/1132444")
                .age(33).build());
        user.add(new User.UserBuilder("Katja", "Müller")
                .street("Wurstgasse 33")
                .city("Hamburg")
                .phone("0179/897492374")
                .age(21).build());
        user.add(new User.UserBuilder("Udo", "Katzbach")
                .street("Westweg 12")
                .city("Hinterkleinhausen")
                .phone("0179/897434234")
                .age(21).build());
        user.add(new User.UserBuilder("Hajo", "Hunder")
                .street("Blitzstrasse 33")
                .city("Köln")
                .phone("0179/8978989898")
                .age(21).build());
        user.add(new User.UserBuilder("Ernst", "Hoecker")
                .street("Platentenweg 104")
                .city("Billighausen")
                .phone("0179/99999")
                .age(21).build());
        return user;
    }
}
