package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    public MyStackDLLBImpl() {this.elems = new DLinkList<>();}

    private DLinkList<E> elems;

    @Override
    public void pop() { elems.removeFirst(); }

    @Override
    public E returnFirstStack() { return elems.returnFirst(); }

    @Override
    public E returnLastStack() { return elems.returnLast(); }


    @Override
    public void push(E x) { elems.addFirst(x); }

    @Override
    public int numOfElems() {
        return elems.numberElement();
    }

    @Override
    public E peek() { return elems.returnFirst(); }
}
