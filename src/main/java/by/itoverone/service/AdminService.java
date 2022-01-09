package by.itoverone.service;

import by.itoverone.entity.Client;
import by.itoverone.entity.Direction;
import by.itoverone.entity.OrderResult;
import by.itoverone.entity.User;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public interface AdminService {
    void createOrder(Direction direction, String tourType, String typeOfPayment, User user) throws EntityNotFoundException;

    List<Client> findClientsByOrderResults(OrderResult result);

}
