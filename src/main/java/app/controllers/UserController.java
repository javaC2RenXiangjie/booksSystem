package app.controllers;

import app.dtos.StringDto;
import app.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping(value = "/{str}")
    public Boolean accoutValidate(@PathVariable String str) {
        return userService.accoutValidate(str);
    }
}
