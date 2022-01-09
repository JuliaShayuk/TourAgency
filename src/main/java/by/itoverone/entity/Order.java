package by.itoverone.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {
    private int id;
    private Client client;
    private Direction direction;
    private TourType tourType;
    private Payment payment;
    private PaymentStatus paymentStatus;
    private OrderResult orderResult;

    public Order(int id, Client client, Direction direction, TourType tourType, Payment payment, PaymentStatus paymentStatus, OrderResult orderResult) {
        this.id = id;
        this.client = client;
        this.direction = direction;
        this.tourType = tourType;
        this.payment = payment;
        this.paymentStatus = paymentStatus;
        this.orderResult = orderResult;
    }

    public Order() {
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    @Column(name = "direction")
    @Enumerated(EnumType.STRING)
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Column(name = "tourType")
    @Enumerated(EnumType.STRING)
    public TourType getTourType() {
        return tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Column(name = "result")
    @Enumerated(EnumType.STRING)
    public OrderResult getOrderResult() {
        return orderResult;
    }

    public void setOrderResult(OrderResult orderResult) {
        this.orderResult = orderResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(client, order.client) && direction == order.direction && tourType == order.tourType && Objects.equals(payment, order.payment) && paymentStatus == order.paymentStatus && orderResult == order.orderResult;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client, direction, tourType, payment, paymentStatus, orderResult);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client=" + client +
                ", direction=" + direction +
                ", tourType=" + tourType +
                ", payment=" + payment +
                ", paymentStatus=" + paymentStatus +
                ", orderResult=" + orderResult +
                '}';
    }
}
