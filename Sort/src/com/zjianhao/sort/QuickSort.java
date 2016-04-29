package com.zjianhao.sort;

/**
 * Created by 张建浩 on 16-4-29.
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] a) {
        quickSort(a,0,a.length-1);

    }

    public void quickSort(int[] a, int start, int end) {
        if (start >= end)
            return ;
        int key = a[start];
        int left = start;
        int right = end;
        while (left < right) {
            while (left<right && a[right] >= key)
                right--;
            a[left] = a[right];
            while (left<right && a[left] <=key)
                left++;
                a[right] = a[left];
        }
        a[left] = key;
        quickSort(a,start,left-1);
        quickSort(a,left+1,end);
    }
}
