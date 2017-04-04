package Tutorials;

import java.lang.*;

/**
 * Created by found on 04-Apr-17.
 */
public class String_Concatenation {
    public static void main(String args[]) {
        String s1 = "Colson";
        String s2 = "Xu";

        // Using StringBuilder (more resource efficient and faster operation than StringBuffer)
        StringBuilder sb = new StringBuilder(14).append(s1).append(" ").append(s2);
        System.out.println(sb);

        // Using StringBuffer
        StringBuffer sbuf = new StringBuffer(14).append(s1).append(" ").append(s2);
        System.out.println(sbuf);

        // Using + operator (Simplest, but create a lot of small string garbage. DO NOT USE IN A LOOP)
        System.out.println(s1 + " " + s2);
    }
}
