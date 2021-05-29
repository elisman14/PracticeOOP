package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(sevenBoom(a));
        int[] b = new int[]{8, 6, 33, 100};
        System.out.println(sevenBoom(b));
        int[] c = new int[]{2, 55, 60, 97, 86};
        System.out.println(sevenBoom(c));
        //2
        int[] d = new int[]{5, 1, 4, 3, 2};
        System.out.println(cons(d));
        int[] e = new int[]{5, 1, 4, 3, 2, 8};
        System.out.println(cons(e));
        int[] f = new int[]{5, 6, 7, 8, 9, 9};
        System.out.println(cons(f));
        //3
        System.out.println(unmix("12345678"));
        System.out.println(unmix("hTsii  s aimex dpus rtni.g"));
        System.out.println(unmix("badce"));
        //4
        System.out.println(noYelling("What went wrong?????????"));
        System.out.println(noYelling("Oh my goodness!!!"));
        System.out.println(noYelling("I just!!! can!!! not!!! believe!!! it!!!"));
        System.out.println(noYelling("Oh my goodness!"));
        System.out.println(noYelling("I just cannot believe it."));
        //5
        xPronounce("Inside the box was a xylophone");
        xPronounce("The x ray is excellent");
        xPronounce("OMG x box unboxing video x D");
        //6
        int[] g = new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        largestGap(g);
        int[] h = new int[]{14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
        largestGap(h);
        int[] i = new int[]{13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};
        largestGap(i);
        //7
        asd(832);
        asd(51);
        asd(7977);
        asd(1);
        asd(665);
        asd(149);
        //8
        commonLastVowel("Hello World!");
        commonLastVowel("Watch the characters dance!");
        commonLastVowel("OOI UUI EEI AAI");
        //9
        memeSum(26, 39);
        memeSum(122, 81);
        memeSum(1222, 30277);
        //10
        unrepeated("teshahset");
        unrepeated("hello");
        unrepeated("aaaaa");
        unrepeated("WWE!!!");
        unrepeated("call 911");
    }

    static String sevenBoom(int[] a){
        boolean e = false;
        for(int i = 0;i < a.length;i++) {
            while (a[i]>0){
                if(a[i]%10==7)
                    e = true;
                a[i]/=10;
            }
        }
        if (e)
            return "Boom!";
        else
            return "there is no 7 in the array";
    }

    static boolean cons(int[] a){
        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();
        if(max-min == a.length-1)
            return true;
        else
            return false;
    }

    static String unmix(String s){
        char[] a = s.toCharArray();
        char t = ' ';
        for(int i = 0;i < a.length;i++)
        {
            if(i%2==0)
                t = a[i];
            else {
                a[i-1] = a[i];
                a[i]=t;
            }
        }
        return String.valueOf(a);
    }

    static String noYelling(String s){
        if(s.endsWith("?") || s.endsWith("!"))
        {
            String s1 = String.valueOf(s.charAt(s.length()-1));
            s = s.replace(s1,"");
            s+=s1;
        }
        return s;
    }

    static void xPronounce(String s){
        String[] s1 = s.split(" ");
        String s2 = "";
        for(int i = 0;i < s1.length;i++){
            if(s1[i].startsWith("x") && s1[i].length()>1)
                s1[i] = "z"+s1[i].substring(1);
            s2 += s1[i].replaceAll("x","cks");
            s2 += " ";
        }
        System.out.println(s2);
    }

    static void largestGap(int[] a){
        Arrays.sort(a);
        int max = 0;
        for(int i = 1;i < a.length;i++)
            if(Math.abs(a[i])-Math.abs(a[i-1]) > max)
                max = Math.abs(a[i])-Math.abs(a[i-1]);
        System.out.println(max);
    }

    static void asd(int a){
        int t = 0,t1 = a;
        while(a > 0){
            t=t*10+a%10;
            a/=10;
        }
        if(t1-t > 0)
            System.out.println(t1-t);
        else
            System.out.println(0);
    }

    static void commonLastVowel(String s){
        String[] s1 = s.split(" ");
        String[] s2 = {"a","e","y","u","i","o","A","E","Y","U","I","O"};
        int[] counter = {0,0,0,0,0,0,0,0,0,0,0,0};
        for(int i = 0;i < s1.length;i++){
            for(int j = 0;j < s2.length;j++)
            {
                if(s1[i].endsWith(s2[j]))
                    counter[j]++;
            }
        }
        for(int i = 0;i < s2.length;i++)
        {
            if(counter[i] == Arrays.stream(counter).max().getAsInt()){
                System.out.println(s2[i]);
                break;
            }
        }
    }

    static void memeSum(int a, int b){
        String s = "";
        while (a > 0 || b > 0){
            s=String.valueOf(a%10+b%10)+s;
            a/=10;
            b/=10;
        }
        System.out.println(s);
    }

    static void unrepeated(String s){
        ArrayList<String> ar = new ArrayList<>();
        for(int i = 0;i < s.length();i++){
            if(!ar.contains(String.valueOf(s.charAt(i))))
                ar.add(String.valueOf(s.charAt(i)));
        }
        String s1 = "";
        for(int i = 0;i < ar.size();i++)
            s1+= ar.get(i);
        System.out.println(s1);
    }
}