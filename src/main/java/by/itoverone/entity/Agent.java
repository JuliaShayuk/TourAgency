package by.itoverone.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;
@Entity
@Table(name = "agent")

public class Agent extends User {
    private int agentPhoneNumber;

    public Agent(int id, String login, String password, Role role, Status status, int agentPhoneNumber) {
        super(id, login, password, role, status);

        this.agentPhoneNumber = agentPhoneNumber;
    }

    public Agent() {

    }

    @Basic
    @Column(name = "AgentPhoneNumber")
    public int getAgentPhoneNumber() {
        return agentPhoneNumber;
    }

    public void setAgentPhoneNumber(int agentPhoneNumber) {
        this.agentPhoneNumber = agentPhoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Agent agent = (Agent) o;
        return agentPhoneNumber == agent.agentPhoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), agentPhoneNumber);
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentPhoneNumber=" + agentPhoneNumber +
                '}';
    }
}
