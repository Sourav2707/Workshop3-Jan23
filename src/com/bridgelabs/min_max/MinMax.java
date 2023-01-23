package com.bridgelabs.min_max;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinMax {


    //1. sort by even number
    //2.sort in ascending order
    //3.find the 0th - min and nth - max position
    public void findMinAndMax(ArrayList<Integer> integerArrayList) {
        List<Integer> evenlist = integerArrayList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
         Integer min = evenlist.stream().min(Integer::compareTo).get();
         Integer max =evenlist.stream().max(Integer::compareTo).get();
        System.out.println("The minimum even integer of the given arraylist is "+min);
        System.out.println("The maximum even integer of the given arraylist is "+max);
    }
}
