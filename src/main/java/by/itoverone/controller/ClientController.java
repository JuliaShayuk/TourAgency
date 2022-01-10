package by.itoverone.controller;

import by.itoverone.entity.Client;
import by.itoverone.entity.Order;
import by.itoverone.entity.User;
import by.itoverone.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
@RequestMapping("/client")
public class ClientController {
    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping
    public String home() {

        return "clientHome";
    }

    @PostMapping("/createOrder")
    public String createOrder(@RequestBody MultiValueMap<String, String> params, Model model, HttpSession session){
        String tourType = params.getFirst("tourType");
        String typeOfPayment = params.getFirst("typeOfPayment");
        Client client = (Client)session.getAttribute("client");
        clientService.createOrder(tourType, typeOfPayment, client);
        model.addAttribute("message", "Your dream soon will come true! Thank you for creating order!");
        return "clientHome";

    }

    @GetMapping("/createOrder")
    public String toCreateOrder(){
        return "createOrder";
    }

    @GetMapping("/deleteOrder")
    public String toDeleteOrder(){
        return "deletedOrder";

    }
    @PostMapping("/deleteOrder")
    public String deleteOrder(@RequestBody MultiValueMap<String, String> params, Model model, HttpSession session){
        final Integer order_id = Integer.valueOf(params.getFirst("order_id"));
        Client client = (Client)session.getAttribute("client");
        clientService.deletedOrders(client, order_id);
        model.addAttribute("message", "Your order deleted!");

        return "clientHome";

    }




    }














