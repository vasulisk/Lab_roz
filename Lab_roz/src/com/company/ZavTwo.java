package com.company;

public class ZavTwo {
    public ZavTwo() {
    }


    public static void main(String[] args)  {

        int n = 671;
        int first = n/100;
        int second = (n - first * 100) / 10;
        int third = (n - first * 100 - second * 10);
        if( first > second & first > third){
            System.out.println(first);
        }else if(second > first & second > third){
            System.out.println(second);
        }else {
            System.out.println(third);}

    }

}

