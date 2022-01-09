package by.itoverone.repository;

import by.itoverone.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
 List<Order> findAllByClientAndAndPaymentStatus(Integer id);
}
