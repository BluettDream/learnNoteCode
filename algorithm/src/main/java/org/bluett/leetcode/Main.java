package org.bluett.leetcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader BR;
    static PrintWriter PW;

    static {
        try {
            BR = new BufferedReader(new FileReader("E:\\dev\\learnNoteCode\\algorithm\\src\\main\\java\\org\\bluett\\leetcode\\ac.in"));
            PW = new PrintWriter(new BufferedWriter(new FileWriter("E:\\dev\\learnNoteCode\\algorithm\\src\\main\\java\\org\\bluett\\leetcode\\ac.out")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static StreamTokenizer ST = new StreamTokenizer(BR);

    public static void main(String[] args) throws Exception {
        int cap = ri();
        LRUCache lruCache = new LRUCache(cap);
        while (BR.ready()) {
            int op = ri();
            if(op == 0){
                lruCache.put(ri(), ri());
                PW.println("null");
            }else if(op == 1){
                int val = lruCache.get(ri());
                PW.println(val);
            }
        }
        PW.flush();
    }

    static class LRUCache {
        static class Node<K, V>{
            K key;
            V value;
            Node<K, V> prev;
            Node<K, V> next;
            public Node(){}
            public Node(K key, V value){this.key = key;this.value = value;}
        }

        Map<Integer, Node<Integer, Integer>> map;
        Node<Integer, Integer> head, tail;
        int size = 2;
        int capacity = 0;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new HashMap<>(capacity);
            this.head = new Node<>();
            this.tail = new Node<>();
            this.head.next = this.tail;
            this.tail.prev = this.head;
        }

        public int get(int key) {
            if(!map.containsKey(key)) return -1;
            Node<Integer, Integer> node = map.get(key);
            // move to head
            moveToHead(node);
            // update map
            map.put(key, node);
            return node.value;
        }

        public void put(int key, int value) {
            if(!map.containsKey(key)) ++size;
            Node<Integer, Integer> node = map.getOrDefault(key, new Node<>());
            node.key = key;
            node.value = value;
            moveToHead(node);
            map.remove(key);
            map.put(key, node);
            if(size -  2 > capacity){
                Node<Integer, Integer> tailNode = this.tail.prev;
                map.remove(tailNode.key);
                --size;
                tailNode.next.prev = tailNode.prev;
                tailNode.prev.next = tailNode.next;
            }
        }

        private void moveToHead(Node<Integer, Integer> node) {
            if(node.prev != null && node.next != null){
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
            node.next = this.head.next;
            this.head.next.prev = node;
            node.prev = this.head;
            this.head.next = node;
        }
    }

    static int ri() throws Exception {
        ST.nextToken();
        return (int) ST.nval;
    }

    static String rs() throws Exception {
        ST.nextToken();
        return ST.sval;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
