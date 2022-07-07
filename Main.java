package com.company.epam;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Logic logic = new Logic();
        List<Integer> l1 = Logic.listCreating();
        List<Integer> l2 = Logic.listCreating();
        Logic.merge(l1, l2);

        System.out.println("Первый массив :" +l1);
        System.out.println("Первый массив :" +l2);

    }
}
