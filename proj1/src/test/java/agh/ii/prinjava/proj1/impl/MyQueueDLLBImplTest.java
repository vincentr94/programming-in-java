package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(0);
    }

    @Test
    void enqueue(){
        queueOfInts.enqueue(3);
        Assertions.assertEquals(3, queueOfInts.returnFirstQueue());

    }

    @Test
    void dequeue(){
        queueOfInts.dequeue();
        Assertions.assertEquals(1, queueOfInts.returnLastQueue());

    }

    @Test
    void numOfElems(){
        Assertions.assertEquals(3, queueOfInts.numOfElems());
    }

    @Test
    void peek(){
        Assertions.assertEquals(2, queueOfInts.returnLastQueue());
    }

    @AfterEach
    void tearDown() {
    }
}