package de.traveltotal.webapp;

import de.traveltotal.webapp.view.UserView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;


@RestController
@RequestMapping(value = "resource/")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Inject //inherited from parent
    private UserApp userApp;

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<UserView> getUser(@PathVariable(value = "id") String id) {

        LOG.info("customerId:{}", id);
        return userApp.getUser(id);

    }


}
