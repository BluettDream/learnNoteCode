package org.bluett.leetcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

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

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while (p != null){
            q = headB;
            while (q != null){
                if(p == q) {
                    return p;
                }
                q = q.next;
            }
            p = p.next;
        }
        return null;
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
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
