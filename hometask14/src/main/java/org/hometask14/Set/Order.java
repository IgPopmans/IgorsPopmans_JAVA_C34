package org.hometask14.Set;

import java.util.Objects;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Order {
    private Integer id;
    private String name;
    private boolean isReady;

    public Order(Integer id, String name, boolean isReady) {
        this.id = id;
        this.name = name;
        this.isReady = isReady;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        this.isReady = ready;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isReady=" + isReady +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return isReady() == order.isReady() && Objects.equals(getId(), order.getId()) && Objects.equals(getName(), order.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), isReady());
    }
}
