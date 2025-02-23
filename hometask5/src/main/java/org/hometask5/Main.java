package org.hometask5;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        OrderReceiver onlineOrderReceiver = new OnlineOrderReceiver();
        OrderRepository orderRepository = new OrderRepositoryImpl();
        CookingProcessService cookingProcessService = new CookingProcessServiceImpl();

        FoodService foodService = new FoodService(onlineOrderReceiver, orderRepository, cookingProcessService);

        String orderDetails = " Burger and Fries";

        foodService.receiveOrder(orderDetails);

        foodService.saveOrder(orderDetails);

        foodService.cookOrder(orderDetails);
    }
}