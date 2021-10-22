package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * interface of Myqueue
 * @param <E>
 */
public interface MyQueue<E> {
    /**
     * add a node a the start of the queue
     * @param x
     */
    void enqueue(E x);

    /**
     * remove the last node of the queue
     */
    void dequeue();

    /**
     * it return the first node of the queue
     * @return the first node of the queue
     */
    E returnFirstQueue();

    /**
     * it return the last node of the queue
     * @return the last node of the queue
     */
    E returnLastQueue();

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     *
     * @return the number of nodes in the queue
     */
    int numOfElems();

    /**
     *
     * @return the last nodes in the queue
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
