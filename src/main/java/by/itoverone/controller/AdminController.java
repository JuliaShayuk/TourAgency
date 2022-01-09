package by.itoverone.controller;

import by.itoverone.entity.Direction;
import by.itoverone.service.AdminService;
import by.itoverone.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private AdminService adminService;
    private ClientService clientService;

    @Autowired
    public AdminController(
            AdminService adminService, ClientService clientService) {
        this.adminService = adminService;
        this.clientService = clientService;

    }
    @GetMapping
    public String home() {
        return "adminHome";
    }

    @GetMapping("/direction")
    public String toSelectDirection(Direction direction) {
        return "adminSelectDirection";
    }

}
