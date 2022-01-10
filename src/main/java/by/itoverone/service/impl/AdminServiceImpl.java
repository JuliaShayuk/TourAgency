package by.itoverone.service.impl;

import by.itoverone.entity.Client;
import by.itoverone.entity.Direction;
import by.itoverone.entity.OrderResult;
import by.itoverone.entity.User;
import by.itoverone.service.AdminService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Override
    public void createOrder(Direction direction, String tourType, String typeOfPayment, User user) throws EntityNotFoundException {

    }

    @Override
    public List<Client> findClientsByOrderResults(OrderResult result) {
        return null;
    }
}
