package com.company;

public class Main{

    public static void main(String[] args) {
        int n1 = 69;
        int n2 = 35;
        int n3 = 18;

        if ( n3 < n2 && n1 < n2)
        {
            if( n3 > n1 ){
                System.out.println(n1);
                System.out.println(n3);
                System.out.println(n2);
            }
            if( n1 > n3 ){
                System.out.println(n3);
                System.out.println(n1);
                System.out.println(n2);
            }
        }
        if( n2 < n1 && n3 < n1 )
        {
            if( n2 > n3 ){
                System.out.println(n3);
                System.out.println(n2);
                System.out.println(n1);
            }
            if( n3 > n2 ){
                System.out.println(n2);
                System.out.println(n3);
                System.out.println(n1);
            }
        }
        if( n1 < n3 && n2 < n3)
        {
            if( n1 > n2 ){
                System.out.println(n2);
                System.out.println(n1);
                System.out.println(n3);
            }
            if( n2 > n1){
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }
        }

    }
    }

