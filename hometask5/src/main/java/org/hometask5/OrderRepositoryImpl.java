package org.hometask5;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class OrderRepositoryImpl implements OrderRepository {


    @Override
    public void saveOrder(String orderDetails) {
        System.out.println("Order  saved to the  database :" + orderDetails);
    }
}
