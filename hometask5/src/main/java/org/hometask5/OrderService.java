package org.hometask5;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public interface OrderService {
    void receiveOrder(String orderDetails);

    void saveOrder(String orderDetails);

    void cookOrder(String orderDetails);
}
