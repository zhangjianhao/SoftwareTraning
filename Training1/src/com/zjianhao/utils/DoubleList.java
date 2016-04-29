package com.zjianhao.utils;

/**
 * Created by ff on 16-4-23.
 */
public class DoubleList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size = 0;



    public void linkFirst(E item){
        Node<E> f = first;
        Node<E> newnode = new Node<E>(item,null,f);
        first = newnode;
        if (f == null){
            last = newnode;
        }else {
            f.prev = newnode;
        }
        size++;
    }


    public void linkLast(E item){
        Node<E> l = last;
        Node<E> newnode = new Node<E>(item,last,null);
        last = newnode;
        if (last == null){
            first = newnode;
        }else {
            last.next = newnode;
        }
        size++;
    }


    public E get(int index){
        return indexOf(index);

    }

    public E indexOf(int index){
        checkRange(index);
        Node<E> curr = first;
        int currIndex = 0;
        while (curr != null && currIndex <index){
            curr = curr.next;
            currIndex++;
        }
        if (currIndex == index){
            return curr.data;
        }
        return null;
    }

    public int getSize(){
        return size;
    }


    public boolean checkRange(int index){
        if (index<0 || index >size){
            throw new IndexOutOfBoundsException("index no ellgal");
        }
        return true;

    }









    private class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        public Node() {
        }

        public Node(E data,Node<E> prev, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

    }
}
