package com.zjianhao.sort;

import com.zjianhao.utils.Utils;

/**
 * Created by 张建浩 on 16-4-28.
 */
public class BubbleSort {
    public static void sort(int[] a) {

    }

    public static  void optimizationBubble(int[] a) {
        boolean isOrder = false;
        for (int i = 0; i < a.length && !isOrder; i++) {
            isOrder = true;
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    isOrder = false;
                    Utils.swap(a, j - 1, j);
                }
            }

        }
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1])
                    Utils.swap(a, j - 1, j);
            }

        }
    }

}
