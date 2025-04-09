package org.bluett.nowcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Main {

    static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter PW = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    static {
        String inputFileName = System.getProperty("in.file");
        String outputFileName = System.getProperty("out.file");
        try {
            if (inputFileName != null && !inputFileName.isEmpty()) {
                BR = new BufferedReader(new FileReader(inputFileName));
            }
            if (outputFileName != null && !outputFileName.isEmpty()) {
                PW = new PrintWriter(new BufferedWriter(new FileWriter(outputFileName)));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static StreamTokenizer ST = new StreamTokenizer(BR);

    public static void main(String[] args) throws Exception {
        while (ST.nextToken() != StreamTokenizer.TT_EOF) {

            PW.flush();
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
}
