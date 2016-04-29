package com.zjianhao.test;

import com.zjianhao.utils.SingleLink;

/**
 * Created by ff on 16-4-23.
 */
public class TestSingleLink {
    public static void main(String[] args) {
        SingleLink<Integer> link=  new SingleLink<>();
        for (int i = 0; i < 10; i++) {
            link.add(i);
        }
        System.out.println("size:"+link.size());



//        link.setData(1,-1);
        link.remove(0);

        for (int i = 0; i <link.size(); i++) {
            Integer element = link.getElement(i);
            System.out.println(element);
        }




    }
}
