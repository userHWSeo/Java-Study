package com.example;

public class StringExam2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        if(str1.equals(str2)){
            System.out.println("str1과 str2의 값이 같다.");
        }

        String s = str1.toUpperCase();
        System.out.println(s);
        System.out.println(str1);

        String substring = str1.substring(3);
        System.out.println(substring);
    }
}
