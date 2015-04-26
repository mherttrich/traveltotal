package de.traveltotal.webapp.view;


import de.traveltotal.domain.User;
import org.springframework.util.StringUtils;

public class UserAssembler {
    private static final String NON_EXISTING_CITY = "Bielefeld";

    public static UserView assemble(User user) {
        UserView view = new UserView();
        view.setName(String.format("%s %s", user.getLastName(), user.getFirstName()));

        if (StringUtils.hasText(user.getCity())) {
            view.setAddress(String.format("%s, %s %s", user.getStreet(), user.getZipCode(), user.getCity()));
        } else {
            view.setAddress(String.format("%s, %s %s", user.getStreet(), user.getZipCode(), NON_EXISTING_CITY));
        }
        view.setContact(user.getPhone());
        return view;
    }
}
