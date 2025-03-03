package org.hometask5;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class OnlineOrderReceiver implements OrderReceiver {
    @Override
    public void receiveOrder(String orderDetails) {
        System.out.println("Online order received : " + orderDetails);
    }
}
