package by.itoverone.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "client")
public class Client extends User {
    private int clientPhoneNumber;

    public Client() {

    }

    public Client(int id, String login, String password, Role role, Status status, int clientPhoneNumber) {
        super(id, login, password, role, status);

        this.clientPhoneNumber = clientPhoneNumber;
    }

    @Basic
    @Column(name = "clientPhoneNumber")
    public int getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(int clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return clientPhoneNumber == client.clientPhoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clientPhoneNumber);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientPhoneNumber=" + clientPhoneNumber +
                '}';
    }
}