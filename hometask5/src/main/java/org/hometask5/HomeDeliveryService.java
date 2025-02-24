package org.hometask5;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class HomeDeliveryService implements DeliveryProcess {
    @Override
    public void deliveryOrder(String orderDetails) {
        System.out.println("Delivery of the order to the house :" + orderDetails);
    }
}
