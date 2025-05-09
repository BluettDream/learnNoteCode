package org.bluett.leetcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

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
        while (BR.ready()){
            int n = Integer.parseInt(BR.readLine());
            ListNode[] listNodes = new ListNode[n];
            for (int i = 0; i < n; i++) {
                List<Integer> list = Arrays.stream(BR.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                ListNode head = new ListNode(list.get(0));
                ListNode p = head;
                for (int j = 1; j < list.size(); j++) {
                    p.next = new ListNode(list.get(j));
                    p = p.next;
                }
                listNodes[i] = head;
            }
            ListNode listNode = new Main().mergeKLists(listNodes);
            while (listNode != null){
                PW.print(listNode.val + " ");
                listNode = listNode.next;
            }
            PW.println();
        }
        PW.flush();
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode p = head;
        p.next = null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, Comparator.comparingInt(ln -> ln.val));
        pq.addAll(Arrays.stream(lists).filter(Objects::nonNull).collect(Collectors.toList()));
        while (!pq.isEmpty()){
            ListNode minNode = pq.poll();
            p.next = minNode;
            if(minNode.next != null){
                pq.offer(minNode.next);
            }
            p = p.next;
            p.next = null;
        }
        return head.next;
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
