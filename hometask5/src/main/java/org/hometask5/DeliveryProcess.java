package org.hometask5;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public interface DeliveryProcess {
    default void deliveryOrder(String orderDetails) {
        System.out.println("Ordering through the window :" + orderDetails);
    }
}
