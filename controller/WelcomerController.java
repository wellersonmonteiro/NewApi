package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/welcome")
public class WelcomerController {

    @GetMapping
    public String welcome(){
        return "Welcome to my springboot aplication";
    }
}
