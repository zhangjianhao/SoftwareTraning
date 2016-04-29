package com.zjianhao.sort;

/**
 * Created by 张建浩 on 16-4-28.
 */
public class InsertSort implements Sort {
    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int cusor = i - 1;
            while (cusor >= 0 && a[cusor] > key) {
                a[cusor + 1] = a[cusor];
                cusor--;
            }
            a[cusor + 1] = key;
        }
    }

    public void binaryInsert(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int right = i - 1;
            int left = 0;
            while (left <=right) {
                int mid = right + left >> 1;
                if (a[mid] < key)
                    left = mid + 1;
                else if (a[mid] >key)
                    right = mid - 1;
            }
            System.out.println(left+":"+right);
            for (int j=i-1; j>=left; j--) {
                a[j + 1] = a[j];
            }
            a[left] = key;
        }
    }

    public void shellSort(int [] a) {
        int d = a.length;
        while (true){
             d = d>>1;
            for (int x=0; x<d; x++) {
                for (int i = x+d; i < a.length; i=i+d) {
                    int key = a[i];
                    int cusor = i -d;
                    while (cusor >= 0 && a[cusor] > key) {
                        a[cusor + d] = a[cusor];
                        cusor -= d;
                    }
                    a[cusor + d] = key;
                }
            }
            if (d == 1)
                break;
        }
    }
}
