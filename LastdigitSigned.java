package org.example;

import java.util.Scanner;

public class LastdigitSigned {
    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        //while(scn.hasNext()){

        // }
        //just complete below statement
        int ans = Math.abs(num%10);

        //below statement print the result
        System.out.println(ans);
    }
}
