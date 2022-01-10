package by.itoverone.service.impl;

import by.itoverone.entity.Client;
import by.itoverone.entity.Order;
import by.itoverone.entity.OrderResult;
import by.itoverone.entity.Status;
import by.itoverone.service.ClientService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public List<Order> getAllClientOrders(Integer id) {
        return null;
    }

    @Override
    public void createOrder(String tourType, String typeOfPayment, Client client) throws EntityNotFoundException {

    }

    @Override
    public void deletedOrders(Client client, Integer order_id) {

    }

    @Override
    public List<Order> getDeletedOrders(Integer clientId) {
        return null;
    }

    @Override
    public List<Client> findAllClients() {
        return null;
    }

    @Override
    public Client findById(Integer id) {
        return null;
    }

    @Override
    public Integer findByOrderResults(Client client, OrderResult done) {
        return null;
    }

    @Override
    public void update(Integer id, Status status) throws EntityNotFoundException {

    }
}
