package com.zjianhao.utils;

import java.util.AbstractList;
import java.util.Arrays;

/**
 * Created by ff on 16-4-23.
 */
public class ArrayList<E> extends AbstractList<E> {

    private Object[] elements;
    private int size = 0;
    private static  final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private Object[] EMPTY_ARRAY = {};

    private int default_size = 10;




    public ArrayList(int initCapacity) {
       ensureCapacity(initCapacity);
    }


    public ArrayList() {
        ensureCapacity(default_size);
    }

    @Override
    public boolean add(E item) {
        ensureCapacity(size+1);
        elements[size++] = item;
        return true;
    }


    public E remove(int index){
        int moveNum = size - index - 1;
        E old = indexOf(index);
        if (moveNum > 0)
        System.arraycopy(elements,index+1,elements,index,moveNum);
        elements[size] = null;
        size -- ;
        return old;

    }

    public E indexOf(int index){
        return (E) elements[index];
    }

    public void ensureCapacity(int minCapacity){
        if (elements == null){
            elements = EMPTY_ARRAY;
            minCapacity = Math.max(minCapacity,default_size);
        }
        if (minCapacity > elements.length){
            System.out.println("minsize:"+minCapacity+"ele:"+elements.length);
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        System.out.println("new size:"+minCapacity);
        int oldSize = elements.length;
        int newSize = oldSize + (oldSize>>1);
        if (newSize <minCapacity){
            newSize = minCapacity;
        }
        if (newSize > MAX_ARRAY_SIZE)
            newSize = MAX_ARRAY_SIZE;

        elements = Arrays.copyOf(elements,newSize);
    }




    @Override
    public E get(int index) {
        return (E)elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}
