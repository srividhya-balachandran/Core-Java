package org.example;

import java.util.Scanner;

public class ReadDifferInputs {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {

            int i = sc.nextInt();
            System.out.println(i);
            float f = sc.nextFloat();
            System.out.println(f);
            long d = sc.nextLong();
            System.out.println(d);
            //String c=sc.next();
            //System.out.println(c.charAt(0));
            byte b = sc.nextByte();
            System.out.println(b);
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(s);// Your code here

        }
    }
}

