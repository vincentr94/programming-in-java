package agh.ii.prinjava.proj1.impl;

import java.sql.SQLOutput;

public class DLinkList<E> {

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }


    Node<E> head = null;

    public void addFirst(E elem) {
        Node<E> n = new Node<>(elem);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }


    public void addLast(E elem) {
        Node <E> n = new Node<>(elem);
        if (head == null) {
            head = n;
        } else {
            Node<E> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
            n.prev = curr;
        }
    }

    public void removeFirst() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node<E> toDelete = head;
            head = head.next;
            head.prev = null;
        }

    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node<E> toDelete = head;
            while (toDelete.next.next != null) {
                toDelete = toDelete.next;
            }
            toDelete.next = null;
        }
    }

    /**
     *
     * @return string
     */
    public String toString() {
        Node<E> p = head;
        System.out.print("chainn : ");
        while (p.next != null) {
            System.out.print("<" +p.elem + ">");
            p = p.next;
        }
        System.out.print("<" +p.elem + ">");
        return (" ");
    }

    public E returnFirst(){
        return head.elem;
    }
    public E returnLast(){
        Node<E> temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp.elem;
    }

    public int numberElement(){
        Node<E> temp = head;
        int compt = 0;
        while (temp.next != null){
            temp = temp.next;
            compt += 1;
        }
        compt += 1;
        return compt;
    }
}


