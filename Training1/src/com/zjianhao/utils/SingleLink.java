package com.zjianhao.utils;

/**
 * Created by ff on 16-4-23.
 */
public class SingleLink<E> {

    Node<E> head;
    private int size = 0;

    public SingleLink() {
        head = new Node<>();
    }

    public void add(E item){
        Node<E> newnode = new Node<E>(item,null);
        if (item != null && head.next == null){
            head.next = newnode;
            size++;
            return ;
        }
        Node<E> temp = head;
        while( temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        size++;
    }



    public E getElement(int index){
        checkRange(index);
        int curr = 0;
        Node<E> temp = head.next;
        while (temp.next != null && curr < index){
            temp = temp.next;
            curr++;
        }
        if (curr == index){
            return temp.data;
        }
        return null;
    }


    public E setData(int index,E item){
        checkRange(index);
        int curr = 0;
        Node<E> temp = head.next;
        while (temp.next != null && curr < index){
            temp = temp.next;
            curr++;
        }
        if (curr == index){
            E data = temp.data;
            temp.data = item;
            return data;
        }
        return null;
    }

    public E remove(int index){
        int curr = 0;
        Node<E> temp = head.next;
        Node<E> prev = temp;
        while (temp.next != null && curr < index){
            prev = temp;
            temp = temp.next;

            curr++;
        }
        if (curr == index){
            E data = temp.data;
            if (temp == head.next){
                head.next= temp.next;
                temp = null;
            }else {
                prev.next = temp.next;
                temp = null;
            }
            size--;

            return data;
        }
        return null;
    }
    public int size(){
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
        Node<E> next;

        public Node() {
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

    }

}
