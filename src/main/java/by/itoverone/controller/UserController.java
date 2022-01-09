package by.itoverone.controller;

import by.itoverone.entity.User;
import by.itoverone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/home")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/home")
    public String home(@RequestParam(required = false) String login, Model model) {
        Optional<User> user = userService.findByLogin(login);
        model.addAttribute("login", login);
        return "home";


    }

    @PostMapping("/login")
    public String login(@RequestBody MultiValueMap<String, String> params, Model model, HttpSession session) {
        String login = params.getFirst("username");
        Optional<User> userOptional = userService.findByLogin(login);

        if (userOptional.isEmpty()) {
            model.addAttribute("message", "Invalid username");
            return "index";
        }
        User user = userOptional.get();
        session.setAttribute("user", user);
        model.addAttribute("user", user);
        return "home";
    }
}
