package org.hometask5;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class FoodService implements OrderService {

    private OrderReceiver orderReceiver;
    private OrderRepository orderRepository;
    private CookingProcessService cookingProcessService;

    public FoodService(OrderReceiver orderReceiver, OrderRepository orderRepository, CookingProcessService cookingProcessService) {
        this.orderReceiver = orderReceiver;
        this.orderRepository = orderRepository;
        this.cookingProcessService = cookingProcessService;

    }
    @Override
    public void receiveOrder(String orderDetails) {
        orderReceiver.receiveOrder(orderDetails);

    }
    @Override
    public void saveOrder(String orderDetails) {
        orderRepository.saveOrder(orderDetails);

    }
    @Override
    public void cookOrder(String orderDetails) {
        cookingProcessService.cookOrder(orderDetails);
    }
}
