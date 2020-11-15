package com.company.task6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The average: " + average(list));
        list.add(10);
        System.out.println("the average: " + average(list));
    }

    public static int average(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer x:list
        ) {
            sum+=x;

        }

        return sum/list.size();
    }
}

