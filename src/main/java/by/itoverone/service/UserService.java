package by.itoverone.service;

import by.itoverone.entity.User;
import by.itoverone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService {

    Optional<User> findByLogin(String login);
    }

