package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println(oppositeHouse(1,3));
        System.out.println(oppositeHouse(2,3));
        System.out.println(oppositeHouse(3,5));
        System.out.println(oppositeHouse(5,46));
        //2
        System.out.println(nameShuffle("Donald Trump"));
        System.out.println(nameShuffle("Rosie O'Donnell"));
        System.out.println(nameShuffle("Seymour Butts"));
        //3
        System.out.println(discount(1500, 50));
        System.out.println(discount(89, 20));
        System.out.println(discount(100, 75));
        //4
        int[] s = new int[]{10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(differenceMaxMin(s));
        //5
        System.out.println(equal(3, 4, 3));
        System.out.println(equal(1, 1, 1));
        System.out.println(equal(3, 4, 1));
        //6
        System.out.println(reverse("Hello World"));
        System.out.println(reverse("The quick brown fox."));
        System.out.println(reverse("Edabit is really helpful!"));
        //7
        System.out.println(programmers(147, 33, 526));
        System.out.println(programmers(33, 72, 74));
        System.out.println(programmers(1, 5, 9));
        //8
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xxxoo"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
        //9
        System.out.println(bomb("There is a bomb."));
        System.out.println(bomb("Hey, did you think there is a BOMB?"));
        System.out.println(bomb("This goes boom!!!"));
        //10
        System.out.println(sameAscii("a", "a"));
        System.out.println(sameAscii("AA", "B@"));
        System.out.println(sameAscii("EdAbIt", "EDABIT"));
    }
    //1
    public static int oppositeHouse(int a ,int b)
    {
        if(a%2==1)
            return (b*2 - a/2*2);
        else
            return b*2-a+1;
    }
    //2
    public static String nameShuffle(String n)
    {
        return n.split(" ")[1] + " " + n.split(" ")[0];
    }
    //3
    public static double discount(double a, double b)
    {
        return a - a*(b/100);
    }
    //4
    public static int differenceMaxMin(int[] a)
    {
        return Arrays.stream(a).max().getAsInt() - Arrays.stream(a).min().getAsInt();
    }
    //5
    public static int equal(int a, int b, int c)
    {
        if(a == b && a == c)
            return 3;
        else if(a == b || a == c || b == c)
            return 2;
        else
            return 0;
    }
    //6
    public static String reverse(String s) {
        String a = "";
        for(int i = s.length()-1;i >= 0;i--)
            a += s.charAt(i);
        return a;
    }
    //7
    public static int programmers(int a, int b, int c){
        return Math.max(Math.max(a,b),c) - Math.min(Math.min(a,b),c);
    }
    //8
    public static boolean getXO(String s){
        int counter = 0;
        counter += s.length() - s.replaceAll("x", "").length();
        counter += s.length() - s.replaceAll("X", "").length();
        counter -= s.length() - s.replaceAll("o", "").length();
        counter -= s.length() - s.replaceAll("O", "").length();

        return counter == 0;
    }
    //9
    public static String bomb(String s){
        if(s.contains("bomb") || s.contains("BOMB"))
            return "DUCK!";
        else
            return "Relax, there's no bomb.";
    }
    //10
    public static boolean sameAscii(String s1, String s2){
        int counter = 0;
        for(int i = 0;i < s1.length();i++)
            counter += s1.charAt(i);
        for(int i = 0;i < s2.length();i++)
            counter -= s2.charAt(i);
        return counter == 0;
    }
}
