package org.hometask14.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Order orderOne = new Order(1,"Book",true);
        Order orderTwo = new Order(2,"Pen",true);
        Order orderThree = new Order(3,"Ipad",true);
        Order orderFour = new Order(4,"Notebook",true);
        Order orderSame = new Order(4,"Notebook",true);

        Set<Order> orders = new HashSet<>();
        orders.add(orderOne);
        orders.add(orderTwo);
        orders.add(orderThree);
        orders.add(orderFour);
        orders.add(orderSame);

        System.out.println(orders.size());
    }

}
