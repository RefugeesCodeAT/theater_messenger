package at.refugeescode.theater_messenger.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController {

    // Display the home page
    @GetMapping
    String page() {
        return "home";
    }
}
