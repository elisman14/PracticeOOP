package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*//1
        sameLetterPattern("ABAB", "CDCD");
        sameLetterPattern("ABCBA", "BCDCB");
        sameLetterPattern("FFGG", "CDCD");
        sameLetterPattern("FFFF", "ABCD");
        //2

        //3
        digitsCount(4666);
        digitsCount(544);
        digitsCount(121317);
        digitsCount(0);
        digitsCount(12345);
        digitsCount(1289396387328L);
        //4

        //5
        int[] a = {1, 2, 3, 5, 6, 7, 8, 9};
        longestRun(a);
        int[] b = {1, 2, 3, 10, 11, 15};
        longestRun(b);
        int[] c = {5, 4, 2, 1};
        longestRun(c);
        int[] d = {3, 5, 7, 10, 15};
        longestRun(d);
        //6
        String[] e = {"95%", "83%", "90%", "87%", "88%", "93%"};
        takeDownAverage(e);
        String[] f = {"10%"};
        takeDownAverage(f);
        String[] g = {"53%", "79%"};
        takeDownAverage(g);
        //7
        rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s.");
        rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!");
        rearrange("is2 Thi1s T4est 3a");
        rearrange("4of Fo1r pe6ople g3ood th5e the2");
        rearrange(" ");
        //8
        maxPossible(9328, 456);
        maxPossible(523, 76);
        maxPossible(9132, 5564);
        maxPossible(8732, 91255);*/
        //9

        //10
        isNew(3);
        isNew(30);
        isNew(321);
        isNew(123);
    }
    //1
    static void sameLetterPattern(String s1, String s2){
        boolean res = true;

        for(int i = 0 ;i < s1.length();i++){
            for(int j = i+1; j < s1.length();j++){
                if(s1.charAt(i) == s1.charAt(j)){
                    if(s2.charAt(i) != s2.charAt(j)){
                        res = false;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
    //3
    static void digitsCount(long n){
        int counter = 1;
        n/=10;
        while(n > 0){
            counter++;
            n/=10;
        }
        System.out.println(counter);
    }
    //4
    static void totalPoints(String[] s, String v){

    }
    //5
    static void longestRun(int[] a){
        Arrays.sort(a);
        int counter = 1, t = 1;
        for(int i = 0;i < a.length-1;i++){
            if(a[i]+1 == a[i+1]){
                t++;
            }else
            if(t > counter){
                counter = t;
                t = 1;
            }
        }
        if(counter < t)
            counter=t;
        System.out.println(counter);
    }
    //6
    static void takeDownAverage(String[] s){
        int counter = 0;
        for(int i = 0; i < s.length;i++) {
            StringBuffer sb = new StringBuffer(s[i]);
            sb.delete(sb.length()-1,sb.length());
            //System.out.println(sb);
            counter += Integer.valueOf(sb.toString());
        }
        System.out.println(counter/(s.length+1)-5 +"%");
    }
    //7
    static void rearrange(String s){
        String[] s1 = s.split(" ");
        for(int i = 0;i < s1.length;i++){
            for(int j = 1;j <= s1.length;j++)
                if(s1[i].contains(String.valueOf(j))){
                    String t = s1[i];
                    s1[i] = s1[j-1];
                    s1[j-1] = t;
                    break;
                }
        }

        for(int i = 0;i < s1.length;i++){
            for(int j = 1;j <= s1.length;j++)
                s1[i] = s1[i].replaceAll(String.valueOf(j),"");
            System.out.print(s1[i]+" ");
        }
        System.out.println();
    }
    //8
    static void maxPossible(int a, int b){
        ArrayList <Integer> arr = new ArrayList<>();
        ArrayList <Integer> res = new ArrayList<>();

        while(a>0) {
            res.add(a % 10);
            a /= 10;
        }
        while(b > 0) {
            arr.add(b % 10);
            b /= 10;
        }
        int t = -1;
        for(int i = res.size()-1;i >= 0;i--){
            for(int j = arr.size()-1;j >= 0;j--){
                if(res.get(i) < arr.get(j)){
                    res.set(i, arr.get(j));
                    t = j;
                }
            }
            if(t != -1){
                arr.remove(t);
                t = -1;
            }
        }
        for(int i = res.size()-1;i >= 0;i--)
            System.out.print(res.get(i));
        System.out.println();
    }
    //9

    //10
    static void isNew(int a){
        int t = a,t1 = 0, counter = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (a > 0){
            if(a%10 != 0)
                arr.add(a % 10);
            else
                counter++;
            a/=10;
        }
        Collections.sort(arr);
        for(int i = 0;i < arr.size();i++)
            t1 = t1*10 + arr.get(i);
        if (counter != 0)
            t1 *= 10 * counter;
        System.out.println(t <= t1);
    }
}

