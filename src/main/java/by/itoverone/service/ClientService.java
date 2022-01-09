package by.itoverone.service;

import by.itoverone.entity.*;

import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public interface ClientService {
    List<Order> getAllClientOrders(Integer id);

    void createOrder(String tourType, String typeOfPayment, Client client ) throws EntityNotFoundException;

    void deletedOrders (Client client, Integer order_id);

    List<Order> getDeletedOrders(Integer clientId);

    List<Client>findAllClients();

    Client findById(Integer id);

    Integer findByOrderResults(Client client, OrderResult done);

    void update (Integer id, Status status) throws EntityNotFoundException;





    }





