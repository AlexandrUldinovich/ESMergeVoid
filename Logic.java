package com.company.epam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Logic extends Main {

    protected static void merge(List<Integer> l1, List<Integer> l2) {

        List<Integer> arr = new ArrayList<>(l1.size());
        arr.addAll(l1);
        int finalSize = l1.size() + l2.size();
        l1.clear();

        int l1Ordinal = 0;
        int l2Ordinal = 0;

        for (int i = 0; i < finalSize; i++) {
            if(l1Ordinal >= arr.size()) {
                l1.add(l2.get(l2Ordinal++));
            } else if (l2Ordinal >= l2.size()) {
                l1.add(arr.get(l1Ordinal++));
            } else if (arr.get(l1Ordinal) <= l2.get(l2Ordinal)) {
                l1.add(arr.get(l1Ordinal++));
            } else {
                l1.add(l2.get(l2Ordinal++));
            }
        }
    }

    protected static List<Integer> listCreating() {

        List<Integer> rez = new ArrayList<>();
        Random r1 = new Random();

        int minimalSize = 3;
        int currentValue = 0;

        for (int i = 0; i < Math.max(minimalSize, r1.nextInt(10)); i++) {
            currentValue += r1.nextInt(10);
            rez.add(currentValue);
        }
        return rez;

    }
}
