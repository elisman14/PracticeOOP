package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //1
        /*
        //2
        collect("intercontinentalisationalism", 6);
        collect("strengths", 3);
        collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15);
        //3
        //4
        int[] a = {1, 2, 3, 9, 4, 5, 15, 3};
        twoProduct(a, 45);
        int[] b = {1, 2, 3, 9, 4, 15, 3, 5};
        twoProduct(b, 45);
        int[] c = {1, 2, -1, 4, 5, 6, 10, 7};
        twoProduct(c, 20);
        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        twoProduct(d,10);
        int[] e = {100, 12, 4, 1, 2};
        twoProduct(e,15);
        //5
        isExact(6);
        isExact(24);
        isExact(125);
        isExact(720);
        isExact(1024);
        isExact(40320);*/
        //6
        //7
        //8
        //9
        //10
    }
    //1
    //2
    static void collect(String s, int n){
        ArrayList<String> arr = new ArrayList<>();
        int a = 0;
        while (a+n <= s.length()){
            arr.add(s.substring(a, a+n));
            a+=n;
        }
        Collections.sort(arr);
        for(String s1 : arr)
            System.out.print(s1+" ");
        System.out.println();
    }
    //3
    //4
    static void twoProduct(int[] arr, int n){
        boolean flag = false;
        for(int i = 0;i < arr.length-1;i++){
            if(n%arr[i] == 0 && !flag)
                for(int j = 0;j < i;j++){
                    if(arr[i]*arr[j] == n){
                        flag = true;
                        System.out.println(arr[j]+" "+ arr[i]);
                    }
                }
        }
    }
    //5
    static void isExact(int n){
        int c = 1, a = 1;
        while(c < n) {
            a++;
            c*=a;
            if (c == n)
                System.out.println(c+" "+a);
        }
    }
    //6
    static void fractions(double val) {
        for (int i = 1;; i++) {
            double tem = val / (1D / i);
            if (Math.abs(tem - Math.round(tem)) < 0.01)
                System.out.println( Math.round(tem) + "/" + i);
        }
    }
    //7
    //8
    //9
    //10
}
