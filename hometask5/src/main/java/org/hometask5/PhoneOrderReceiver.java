package org.hometask5;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class PhoneOrderReceiver implements OrderReceiver {
    @Override
    public void receiveOrder(String orderDetails) {
        System.out.println("Phone order received" + orderDetails);

    }
}
