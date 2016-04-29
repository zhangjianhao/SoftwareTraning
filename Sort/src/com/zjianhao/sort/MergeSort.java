package com.zjianhao.sort;

/**
 * Created by 张建浩 on 16-4-29.
 */
public class MergeSort implements Sort{
    @Override
    public void sort(int[] a) {
        int[] b = new int[a.length];
             mergeSort(a,b,0,a.length-1);

    }



    public void mergeSort(int[] a,int []b, int left,int right) {
        if (left>=right)
            return;
        int mid = left + right >> 1;
        mergeSort(a,b,left,mid);
        mergeSort(a,b,mid+1,right);
        merge(a,b,left, mid, right);
    }

    private static void merge(int[] a, int [] b,int left, int mid, int right) {
             int i = left;
             int j = mid+1;
             int k = left;
        while (i<=mid && j<=right)
            b[k++] =  a[i] < a[j]? a[i++]:a[j++];
        while (i<=mid)
            b[k++] = a[i++];
        while (j<=right)
            b[k++] = a[j++];
        for (i=left; i<=right; i++)
            a[i] = b[i];

    }


    public static  void NoMerge(int[] a,int []b, int left,int right){
        for (int block = 1; block<a.length; block = block * 2) {
            for (int i = 0; i<a.length; i = i*2){

                merge(a,b,i,i+block);
            }
        }
    }



}
