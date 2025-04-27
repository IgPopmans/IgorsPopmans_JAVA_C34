package org.hometask18;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {


        Employee employeeOne = new Employee(Profession.JAVASCRIPT_DEV, new BigDecimal("2000"));
        Employee employeeTwo = new Employee(Profession.PYTON_DEV, new BigDecimal("7000"));
        Employee employeeThree = new Employee(Profession.JAVA_DEV, new BigDecimal("5000"));
        Employee employeeFour = new Employee(Profession.TESTER, new BigDecimal("3500"));
        Employee employeeFive = new Employee(Profession.TESTER, new BigDecimal("2500"));
        Employee employeeSix = new Employee(Profession.PYTON_DEV, new BigDecimal("2500"));
        Employee employeeSeven = new Employee(Profession.JAVASCRIPT_DEV, new BigDecimal("2500"));

        List<Employee> employees = List.of(employeeOne, employeeTwo, employeeThree, employeeFour, employeeFive, employeeSix, employeeSeven);


        //1) Среднюю зп по профессиям

        Map<Profession, BigDecimal> averageSalaryByProfession = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getProfession,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .map(Employee::getSalary)
                                        .reduce(BigDecimal.ZERO, BigDecimal::add)
                                        .divide(BigDecimal.valueOf(list.size()), 2, RoundingMode.HALF_UP)
                        )
                ));

        averageSalaryByProfession.forEach((profession, avgSalary) -> System.out.println(profession + " -- " + avgSalary));

        //2) Сколько работников относится к каждой из профессий

        Map<Profession, Long> professionLongMap = employees.stream().
                collect(Collectors.groupingBy(Employee::getProfession, Collectors.counting()));

        professionLongMap.forEach((profession, count) -> System.out.println(profession + " -- " + count));

        //3) Сколько компания тратит денег на зп каждой профессии

        Map<Profession, BigDecimal> salaryByProfession = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getProfession,
                        Collectors.reducing(
                                BigDecimal.ZERO,
                                Employee::getSalary,
                                BigDecimal::add
                        )
                ));

        salaryByProfession.forEach((profession, salary) -> System.out.println(profession + "--" + salary));
    }
}