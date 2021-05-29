package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(convert_to_sec(5));

        System.out.println(point_counter(13,12));

        System.out.println(point_counter2(3 ,4,2));

        System.out.println(check(55));

        System.out.println(check2(true,false));

        System.out.println(walls(54, 1, 43));

        System.out.println(squaed(5));

        System.out.println(profitableGamble(0.2,50,9));

        System.out.println(frames(1,1));

        System.out.println(mod(218,5));
    }

    public static int convert_to_sec(int min)
    {
        return min*60;
    }

    public static int point_counter(int a, int b)
    {
        return  a*2 + b*3;
    }

    public static int point_counter2(int w, int d, int l)
    {
        return w*3 + d;
    }

    public static boolean check(int a)
    {
        return a%5 == 0;
    }

    public static boolean check2(boolean a, boolean b)
    {
        return a&&b;
    }

    public static int walls(int n, int w, int h)
    {
        return n/(w*h);
    }

    public static int squaed(int b) {
        return b*b;
    }

    public static boolean profitableGamble(double prob, double prize, double pay)
    {
        return prob*prize > pay;
    }

    public static int frames(int a, int b)
    {
        return a*b*60;
    }

    public  static int mod(int a, int b)
    {
        return a - a/b*b;
    }
}
