package by.itoverone.repository;

import by.itoverone.entity.Agent;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AgentRepository extends JpaRepository<Agent, Integer> {

    Optional<Agent> findAgentByLogin(String login);


}
