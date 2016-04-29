package com.zjianhao.sort;

import com.zjianhao.utils.Utils;

/**
 * Created by 张建浩 on 16-4-28.
 */
public class SelectSort implements Sort{
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i] > a[j])
                    Utils.swap(a,i,j);
            }

        }
    }
}
