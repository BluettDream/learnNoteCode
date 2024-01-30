package org.bluett;

import java.io.*;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer st = new StreamTokenizer(reader);
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));//写

    public static void main( String[] args ) throws IOException {
        // TODO

        pw.flush();
    }

    static int ri() throws IOException {//读int
        st.nextToken();
        return (int) st.nval;
    }
    static String rs() throws IOException{//读S
        st.nextToken();
        return st.sval;
    }
}