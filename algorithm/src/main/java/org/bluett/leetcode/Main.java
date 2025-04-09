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
        while (BR.ready()){
            String line = BR.readLine();
            String[] split = line.substring(1, line.length() - 1).split(",");
            ListNode h = new ListNode(Integer.parseInt(split[0]));
            ListNode p = h;
            for (int i = 1; i < split.length; i++) {
                p.next = new ListNode(Integer.parseInt(split[i]));
                p = p.next;
            }
            new Main().reverseList(h);
            PW.flush();
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
