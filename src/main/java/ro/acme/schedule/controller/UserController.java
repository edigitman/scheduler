package ro.acme.schedule.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.acme.schedule.entity.User;

/**
 * Created by gitmaal on 02/10/2015.
 */
@RestController
public class UserController {


    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public User getAll(){
        User user = new User();
        user.setName("john");
        return user;
    }

}
