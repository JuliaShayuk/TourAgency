package by.itoverone.repository;

import by.itoverone.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String>{

    Optional<User> findByLogin(String login);

}

