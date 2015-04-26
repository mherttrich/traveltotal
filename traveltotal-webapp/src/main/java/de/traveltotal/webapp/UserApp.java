package de.traveltotal.webapp;


import com.google.common.collect.Lists;
import de.traveltotal.domain.User;
import de.traveltotal.service.UserService;
import de.traveltotal.webapp.view.UserAssembler;
import de.traveltotal.webapp.view.UserView;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
public class UserApp {

    @Inject
    private UserService userService;

    List<UserView> getUser(String customerId) {

        List<User> allUser = userService.getAllUser();
        List<UserView> views = Lists.newArrayList();
        for (User user : allUser) {
            views.add(UserAssembler.assemble(user));
        }
        return views;
    }
}
