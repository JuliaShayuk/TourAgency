package by.itoverone.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "payment")
public class Payment {
    private int id;
    private int sum;
    private PaymentType paymentType;

    public Payment(int id, int sum, PaymentType paymentType) {
        this.id = id;
        this.sum = sum;
        this.paymentType = paymentType;
    }

    public Payment() {
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

    @Basic
    @Column(name = "sum")
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    @Basic
    @Column(name = "typeOfPayment")
    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id && sum == payment.sum && paymentType == payment.paymentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sum, paymentType);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", sum=" + sum +
                ", paymentType=" + paymentType +
                '}';
    }
}
