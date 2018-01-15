package app.actions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class LoginAction {

    private Logger logger = LoggerFactory.getLogger(LoginAction.class);

    @GetMapping(value = "")
    public String login() {
        return "login";
    }
}
