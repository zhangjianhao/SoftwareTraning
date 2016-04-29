package com.zjianhao.com.zjianhao.test;

/**
 * Created by 张建浩 on 16-4-29.
 */
public class BinarySearch {

    public int  binarySearch(int [] a,int left, int right,int target) {
        if (left > right)
            return -1;
        int mid = left + right >> 1;
        if (a[mid] > target)
            right = mid - 1;
        else if (a[mid] == target)
            return mid;
        else
            left = mid + 1;
       return  binarySearch(a, left, right, target);
    }

    public int nBinarySearch(int[] a, int left, int right, int target) {
        while (left <= right) {
            int mid = left + right >> 1;
            if (a[mid] > target)
                right = mid - 1;
            else if (a[mid] == target)
                return mid;
            else
                left = mid + 1;
        }
        return -1;
    }
}
