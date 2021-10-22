package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 *interface for MyStack
 * @param <E>
 */
public interface  MyStack<E> {
    /**
     *it remove the first element of a stack
     */
    void pop();

    /**
     *it add an element at the start of a stack
     * @param x
     */
    void push(E x);

    /**
     *it return the data of the first node
     * @return the data of the first node
     */
    E returnFirstStack();

    /**
     *it return the data of the last node
     * @return the data of the last node
     */

    E returnLastStack();



    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     *it return the number of nodes
     * @return the number of nodes
     */
    int numOfElems();

    /**
     *it return the ifrst element of the list
     * @return the first node of the list
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
