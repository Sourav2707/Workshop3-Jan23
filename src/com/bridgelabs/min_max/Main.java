package com.bridgelabs.min_max;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MinMax minMax = new MinMax();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        //4,5,2,6,7,33,45,32,45,89,102,117,8,10,11,18

        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(2);
        integerArrayList.add(6);
        integerArrayList.add(7);
        integerArrayList.add(33);
        integerArrayList.add(45);
        integerArrayList.add(32);
        integerArrayList.add(45);
        integerArrayList.add(89);
        integerArrayList.add(102);
        integerArrayList.add(117);
        integerArrayList.add(8);
        integerArrayList.add(10);
        integerArrayList.add(11);
        integerArrayList.add(18);
        minMax.findMinAndMax(integerArrayList);
    }
}
