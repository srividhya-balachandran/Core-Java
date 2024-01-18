package org.example;

public class TypeCast {
    public static void main(String[] args){
        /*
        Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

         */
        double d=56.96;
        int ind=(int)d;
        System.out.println(ind);

    }
}
