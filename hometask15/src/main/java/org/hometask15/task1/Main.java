package org.hometask15.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {


//    1) Есть коллекция пользователей. У каждого пользователя есть уникально поле - login.
//    Необходимо на основе данной коллекции создать map где ключ - это логин, а значение сам объект пользователь.


    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("bravo"));
        users.add(new User("tango"));
        users.add(new User("betta"));
        users.add(new User("alpha"));

        Map<String, User> userMap = new HashMap<>();

        for (User user : users) {
            userMap.put(user.getLogin(), user);
        }

        for (Map.Entry<String, User> stringUserEntry : userMap.entrySet()) {
            System.out.println("Login: " + stringUserEntry.getKey() + "User: " + stringUserEntry.getValue());
        }
    }
}
