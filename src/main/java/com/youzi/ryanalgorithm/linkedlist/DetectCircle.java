package com.youzi.ryanalgorithm.linkedlist;

/**
 * @author Ryan
 * @create 2022-03-07 11:57 下午
 */
public class DetectCircle {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);
        System.out.println("判断链表有环的结果："+checkCircle(myLinkedList.head));

    }

    public static boolean checkCircle(Node head) {
        Node temp=head;
        while (temp.next!=null){
            return true;
        }
        return false;
    }
}
