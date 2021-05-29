package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //1
        String[][] s = {{"Nice", "Abu Dhabi", "Naples", "Vatican City"},{String.valueOf(942208), String.valueOf(1482816), String.valueOf(2186853), String.valueOf(572)}};
        System.out.println(Arrays.deepToString(millionsRounding(s)));
        //2
        System.out.println(Arrays.toString(otherSides(1)));
        System.out.println(Arrays.toString(otherSides(12)));
        System.out.println(Arrays.toString(otherSides(2)));
        System.out.println(Arrays.toString(otherSides(3)));
        //3
        rps("rock", "paper");
        rps("paper", "rock");
        rps("paper", "scissors");
        rps("scissors", "scissors");
        rps("scissors", "paper");
        //4
        int[] x = {12, 90, 75};
        System.out.println(warOfNumbers(x));
        int[] a = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println(warOfNumbers(a));
        //5
        System.out.println(reverseCase("Happy Birthday"));
        System.out.println(reverseCase("MANY THANKS"));
        System.out.println(reverseCase("sPoNtAnEoUs"));
        //6
        System.out.println(inatorInator("Shrink"));
        System.out.println(inatorInator("DooM"));
        System.out.println(inatorInator("EvilClone"));
        //7
        System.out.println(doesBrickFit(1, 1, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 2, 1, 1));
        //8
        System.out.println(totalDistance(70.0, 7.0, 0, false));
        System.out.println(totalDistance(36.1, 8.6, 3, true));
        System.out.println(totalDistance(55.5, 5.5, 5, false));
        //9
        double[] c = {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3};
        System.out.println(mean(c));
        double[] b ={2, 3, 2, 3};
        System.out.println(mean(b));
        double[] d = {3, 3, 3, 3, 3};
        System.out.println(mean(d));
        //10
        System.out.println(parityAnalysis(243));
        System.out.println(parityAnalysis(12));
        System.out.println(parityAnalysis(3));
    }

    static String[][] millionsRounding(String[][] s){
        //String[][] s1 = s;
        for(int i = 0;i < s[0].length;i++)
        {
            s[1][i] = String.valueOf(Math.round((Double.parseDouble(s[1][i]))/1000000)*1000000);
        }
        return s;
    }

    static double[] otherSides(double x)
    {
        double[] sides = new double[2];
        sides[0] = x * 2;
        sides[1] = Math.sqrt(x*2*x*2 - x*x);
        return sides;
    }

    static void rps (String s1, String s2)
    {
        if(s1 == s2)
            System.out.println("TIE");
        else if(s1.startsWith("r"))
        {
            if(s2.startsWith("p"))
                System.out.println("Player 2 wins");
            else
                System.out.println("Player 1 wins");
        }else if(s1.startsWith("p"))
        {
            if(s2.startsWith("s"))
                System.out.println("Player 2 wins");
            else
                System.out.println("Player 1 wins");
        }else
        if(s2.startsWith("r"))
            System.out.println("Player 2 wins");
        else
            System.out.println("Player 1 wins");
    }

    static int warOfNumbers(int[] x)
    {
        int n = 0,j = 0;
        for(int i = 0;i < x.length;i++)
        {
            if(x[i]%2==0)
                n+=x[i];
            else
                j+=x[i];
        }
        return Math.abs(n - j);
    }

    static char[] reverseCase(String s){
        char[] arr = s.toCharArray();
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) != 32) {
                if (s.charAt(i) < 91) {
                    arr[i] += 32;
                    //s = s.substring(0,i) + s.substring(i,i+1).toLowerCase()+s.substring(i+1);
                } else {
                    arr[i] -= 32;
                    //s = s.substring(0,i) + s.substring(i,i+1).toUpperCase()+s.substring(i+1);
                }
            }
        }
        return arr;
    }

    static String inatorInator(String s){
        String s1 = s.toLowerCase();
        if(s1.endsWith("e")||s1.endsWith("a")||s1.endsWith("y")||s1.endsWith("u")||s1.endsWith("i")||s1.endsWith("o"))
            s+="-inator " + s.length() + "000" ;
        else
            s+="inator " + s.length() + "000";
        return s;
    }

    static Boolean doesBrickFit(int a, int b, int c, int x, int y){
        if(a <= x)
            if(b <= y || c <= y)
                return true;
            else
                return false;
        else if(b <= x)
            if(a <= y || c <= y)
                return true;
            else
                return false;
        else if(c <= x)
            if(a <= y || b <= y)
                return true;
            else
                return false;
        else
            return false;
    }

    static double totalDistance(double l, double lpd, int count, boolean condi){
        if(condi) {

            return (l / (lpd * (((double)5*count/100)+1)*1.1))*100;
        }else{
            return (l / (lpd * (((double)5*count/100)+1)))*100;
        }
    }

    static double mean(double[] a){
        double t = 0;
        for(int i = 0;i < a.length;i++)
            t += a[i];
        return t/a.length;
    }

    static boolean parityAnalysis(int n){
        int c = 0, t = n;
        while(t > 0){
            c+=t%10;
            t/=10;
        }
        //System.out.println(c);
        return (c%2==1 && n%2==1) || (c%2==0 && n%2==0);
    }
}