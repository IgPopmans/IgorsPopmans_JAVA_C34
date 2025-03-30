package org.hometask9;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

//        Задача 1:
//
//        Создать класс, в котором будет статический метод. Этот метод принимает на вход три
//
//        параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
//
//        login должна быть меньше 20 символов и поле не должено содержать пробелы. Если login не
//
//        соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
//
//        password должна быть меньше 20 символов, не должен содержать пробелы и должен содержать хотя бы одну цифру (используем regex). Также password и confirmPassword должны быть равны.
//
//                Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//
//        WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
//                второй принимает сообщение исключения (текст ошибки) и передает его в конструктор класса Exception.
//
//                Проверить данный метод, вызвав его из другого метода и обработать возможные ошибки - выведя в терминал сообщение, что не правильно задано.
//
//                Если ошибок нет - то вывести сообщение об успешной валидации


        try {
            if (Validator.validate("validLogin", "password1", "password12")) {
                System.out.println("Validation successful");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
