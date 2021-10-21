package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
        stackOfInts.push(2);
        stackOfInts.push(1);
        stackOfInts.push(0);
    }

    @Test
    public void pop(){
        stackOfInts.pop();
        Assertions.assertEquals(1,stackOfInts.returnFirstStack());
    }

    @Test
    public void push(){
        stackOfInts.push(3);
        Assertions.assertEquals(3,stackOfInts.returnFirstStack());
    }

    @Test
    public void numofElems(){
        Assertions.assertEquals(3, stackOfInts.numOfElems());
    }

    @Test
    public void peek(){
        Assertions.assertEquals(0, stackOfInts.returnFirstStack());
    }
    @AfterEach
    void tearDown() {

    }
}