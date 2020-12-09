package com.nuxio.chapter5;

import java.util.*;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];

        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));

        Integer[] aa = {
                new Integer(1),
                new Integer(2),
                3,
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                3
        };

        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(b));
    }
}
