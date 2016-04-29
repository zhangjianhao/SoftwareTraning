package com.zjianhao.utils;

import com.zjianhao.sort.Sort;

/**
 * Created by 张建浩 on 16-4-29.
 */
public class TestUtils {
    public static long getrunTime(Sort sort,int [] a){
        long before = System.currentTimeMillis();
        sort.sort(a);
        long aftert = System.currentTimeMillis();
        return aftert - before;
    }

}
