package by.itoverone.repository;

import by.itoverone.entity.Client;
import by.itoverone.entity.Order;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    @Override
    Optional<Client> findById(Integer id);



}