package de.traveltotal.webapp;

import de.traveltotal.domain.User;
import de.traveltotal.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;


@RestController
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Inject //inherited from parent
    private UserService userService;

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUser(@RequestParam(value = "customerId", required = false) String customerId) {

        LOG.info("customerId:{}", customerId);

        return userService.assembleAll();
    }


}
