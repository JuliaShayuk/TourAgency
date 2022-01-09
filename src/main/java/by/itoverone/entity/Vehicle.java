package by.itoverone.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    private int id;
    private VehicleType type;
    private int countOfSeats;

    public Vehicle(int id, VehicleType type, int countOfSeats) {
        this.id = id;
        this.type = type;
        this.countOfSeats = countOfSeats;
    }

    public Vehicle() {
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

    @Column(name = "typeOfVehicle")
    @Enumerated(EnumType.STRING)
    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
@Column(name = "countOfSeats")
    public int getCountOfSeats() {
        return countOfSeats;
    }

    public void setCountOfSeats(int countOfSeats) {
        this.countOfSeats = countOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id && countOfSeats == vehicle.countOfSeats && type == vehicle.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, countOfSeats);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", type=" + type +
                ", countOfSeats=" + countOfSeats +
                '}';
    }
}

