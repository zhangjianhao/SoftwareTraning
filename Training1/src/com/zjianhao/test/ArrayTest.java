package com.zjianhao.test;

import com.zjianhao.utils.ArrayList;

/**
 * Created by ff on 16-4-23.
 */
public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        java.util.ArrayList
        for (int i = 0; i < 100; i++) {
            array.add(i);
        }


        array.remove(1);
        array.remove(30);
        array.remove(array.size());
        System.out.println(array.size());

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
