package com.youzi.ryanalgorithm.linkedlist;

import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ryan
 * @create 2022-03-07 11:35 下午
 */
@Data
public class MyLinkedList {
    Node head = null;
    private AtomicInteger size;


    public void addNode(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    /**
     * 打印结点
     */
    public void printLink() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println("reach the end");
    }
}
