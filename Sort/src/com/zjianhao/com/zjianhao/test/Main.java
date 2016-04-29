package com.zjianhao.com.zjianhao.test;

import com.zjianhao.sort.MergeSort;
import com.zjianhao.utils.Utils;

/**
 * Created by 张建浩 on 16-4-28.
 */
public class Main {
    public static void main(String[] args) {
//        int[] a = {7,2,3,11,5,2};
//        BinarySearch search = new BinarySearch();
//        int index = search.nBinarySearch(a,0,a.length-1,2);
//        System.out.println(index);
        int[] a = new int[10];
        int[] b = new int[10];
        Utils.createRandom(a);
        MergeSort sort = new MergeSort();
        sort.NoMerge(a,b,0,a.length-1);
        Utils.printArray(a);
//        int [] b = a.clone();
//        InsertSort sort = new InsertSort();
////
////
////
//        QuickSort quickSort = new QuickSort();
//        long before = System.currentTimeMillis();
//        quickSort.quickSort(b,0,b.length-1);
////        Utils.printArray(b);
//        long after = System.currentTimeMillis();
//        System.out.println(after-before);
//        before = System.currentTimeMillis();
//       sort.sort(a);
//        after = System.currentTimeMillis();
//        System.out.println(after-before);


       /* System.out.println("before:");
        Utils.printArray(a);
        Sort sort = new HeapSort();
        sort.sort(a);
        System.out.println("after:");
        Utils.printArray(a);
*/
//        System.out.println(5>>1);




    }
}
