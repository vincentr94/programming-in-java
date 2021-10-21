package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
        dLinkList.addFirst(4);
        dLinkList.addFirst(3);
        dLinkList.addFirst(2);
        dLinkList.addFirst(1);
        System.out.print(dLinkList);
    }

    @Test
    void addFirst(){
        dLinkList.addFirst(3);
        Assertions.assertEquals(3, dLinkList.returnFirst());
    }

    @Test
    void addLast(){
        dLinkList.addLast(3);
        Assertions.assertEquals(3, dLinkList.returnLast());
    }

    @Test
    void removeFirst(){
        dLinkList.removeFirst();
        Assertions.assertEquals(2, dLinkList.returnFirst());
    }

    @Test
    void removeLast(){
        dLinkList.removeLast();
        Assertions.assertEquals(1, dLinkList.returnLast());
    }

    @Test
    void displayList(){
        dLinkList.toString();
    }

    @AfterEach
    void tearDown() {
    }
}