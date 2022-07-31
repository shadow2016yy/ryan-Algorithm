package com.youzi.ryanalgorithm.linkedlist;

import lombok.Data;

/**
 * @author Ryan
 * @create 2022-03-07 11:32 下午
 */
@Data
public class Node {
     Object value;
     Node next = null;

    public Node(Object value) {
        this.value = value;
    }
}
