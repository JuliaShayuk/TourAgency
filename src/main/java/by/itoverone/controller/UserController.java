package by.itoverone.controller;

import by.itoverone.entity.Client;
import by.itoverone.entity.User;
import by.itoverone.service.ClientService;
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
    private ClientService clientService;

    @Autowired
    public UserController(UserService userService, ClientService clientService) {
        this.userService = userService;
        this.clientService = clientService;
    }

    @GetMapping("/")
    public String home(@RequestParam(required = false) String login, Model model) {
        Optional<User> user = userService.findByLogin(login);
        model.addAttribute("login", login);
        return "home";

    }

    @GetMapping("/button")
    public String home1(){
        System.out.println("HERE");
        return "index";
    }


    @PostMapping("/login")
    public String login(@RequestBody MultiValueMap<String, String> params, Model model, HttpSession session) {
        String login = params.getFirst("login");
        Optional<User> userOptional = userService.findByLogin(login);

        System.out.println("In login : "+(userOptional.isEmpty()?null:userOptional.get()));
        if (userOptional.isEmpty()) {
            model.addAttribute("message", "Invalid username");
            return "index";
        }
        User user = userOptional.get();
        Client client = clientService.findById(user.getId());
        if(client!=null){
            session.setAttribute("client", client);
        }else {
            session.setAttribute("user", user);
        }
        model.addAttribute("user", user);
        return "clientHome";
    }
}
