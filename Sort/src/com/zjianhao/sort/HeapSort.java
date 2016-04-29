package com.zjianhao.sort;

import com.zjianhao.utils.Utils;

/**
 * Created by 张建浩 on 16-4-29.
 */
public class HeapSort implements Sort{

    public void heapSort(int [] a){
        for (int i=a.length/2; i>=0; i--) {
            headAdjust(a, i, a.length);
        }
        for (int i=a.length-1; i>0; i--) {
            Utils.swap(a,0,i);
            headAdjust(a,0,i);
        }



    }

    private void headAdjust(int[] a, int parent, int length) {
        while (2*parent+1 <length){
            int lchild = parent<<1;
            int rchild = lchild+1;
            int maxChild = 0;
            if (lchild<length-1)
            maxChild = a[lchild]>a[rchild]?lchild:rchild;
            else break;
            if (a[maxChild] > a[parent])
            Utils.swap(a,parent,maxChild);
            else break;
            parent = maxChild;
        }
    }

    @Override
    public void sort(int[] a) {
        heapSort(a);
    }
}
