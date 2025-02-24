package org.hometask5;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class CookingProcessServiceImpl implements CookingProcessService{
    @Override
    public void cookOrder(String orderDetails) {
        System.out.println("Order is preparing : " + orderDetails);
    }
}
