package ro.musiclover.manicureappointments.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String gotoWelcomePage() {
        return "welcomePage";
    }
}
