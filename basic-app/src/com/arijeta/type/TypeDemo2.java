package com.arijeta.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //掌握表达式的自动类型转换的规则
        byte a=10;
        int b=20;
        double c=1.0;
        double d=a+b+c;
        System.out.println(d);


        byte i=10;
        byte j=20;
        int k=i+j;
        System.out.println(k);
    }
}
