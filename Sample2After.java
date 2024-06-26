package org.example;

import java.util.List;

public class Sample2After {
    public static void main(String[] argc){
        List<Integer> List1 = List.of(3,2,1);
        List<Integer> List2 = List.of(3,2,11);
        List<Integer> List3 = List.of(3,21,11);

        int sum1 = addPoint(List1);
        int sum2 = addPoint(List2);
        int sum3 = addPoint(List3);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
    public static int addPoint(List<Integer> list){
        int sum = 0;
        for (Integer e : list) {
            sum += e;
        }
        return sum;
    }
}

