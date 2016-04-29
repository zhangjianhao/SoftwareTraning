package com.zjianhao.test;

import com.zjianhao.utils.DoubleList;

import java.util.Queue;

/**
 * Created by ff on 16-4-23.
 */
public class TestDoubleList {
    public static void main(String[] args) {
        DoubleList<Integer> dl = new DoubleList<>();
        for (int i=0; i<10; i++){
            dl.linkFirst(i);
        }
        System.out.println("size:"+dl.getSize());
        for (int i = 0; i < dl.getSize();i++) {
            System.out.println(dl.get(i));

        }
        Queue



    }
}
