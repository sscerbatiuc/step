package com.company.wrappers;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
//        Byte b1 = (byte) 10;
//        Byte b2 = 15;
//
//        int x = 5;
//       sum(10, 15);
//       sum(x, 15);
//       Integer a1 = 10;
//       Integer a2 = 15;
//       sum(a1, a2);

        sum();
        sum(1);
        sum(1,2);
        sum(1,2,3,4,5,6,7,8,9);
        // ...

        sum2(new int[0]);
        sum2(new int[]{1});
        sum2(new int[]{1,2});
        sum2(new int[]{1,2,3,4,5,6,7,8,9});


    }



    public static void method(String period, double... revenue){
        System.out.println(period);
        double sum = 0.0;
        for(double value: revenue){
            sum += value;
        }
        System.out.println(sum);
    }

    public static void sum2(int[] arr){
        // ....
    }

    public static void sum(int... numbers){
        System.out.println(numbers.length);
        int sum = 0;
        for(int num: numbers) {
            sum += num;
        }
        System.out.println("Sum " + sum);
    }

//    public static void sum(int a, int b) {
//        Integer aWrap = a;
//        double division = aWrap.doubleValue() / 3;
//        System.out.println(a + b);
//    }

    public void example(){
        Boolean bool = true;
        Boolean bool2 = new Boolean(true);
        Boolean bool3 = Boolean.valueOf("true");
        boolean aTrue = Boolean.parseBoolean("true");
        int i = Integer.parseInt("10000000000000000000");

        Scanner sc = new Scanner(System.in);
        sc.nextInt();


        Byte b1 = Byte.valueOf((byte)10);
        Byte b2 = new Byte((byte)11);

        byte result = b1.byteValue();


        System.out.println(b1 < b2);
    }
}
