package com.zjianhao.utils;

/**
 * Created by 张建浩 on 16-4-28.
 */
public class Utils  {
    private int anInt = 0;

    public static void swap(int[] a, int i, int j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }

    public static void printArray(int [] a){
        for (int n : a) {
            System.out.print(n+",");
        }
        System.out.println();
    }

    public static void createRandom(int[] a) {
        for (int i=0; i<a.length; i++)
            a[i] = (int)(Math.random()*a.length);
    }

    public static void createOrder(int[] a) {
        for (int i=0; i<a.length; i++)
            a[i] = i;
    }
    public static void createBack(int[] a) {
        for (int i=a.length-1; i>=0; i--)
            a[i] = i;
    }

}
