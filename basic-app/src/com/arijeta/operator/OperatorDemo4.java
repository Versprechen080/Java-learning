package com.arijeta.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //自增自减运算符
        int a = 10;
        a++;//a=a+1; 单独使用和++a效果一样
        System.out.println(a);

        int b = 10;
        b--;//--b;
        System.out.println(b);

        int c = 10;
        int rs = ++c;
        System.out.println(rs);
        System.out.println(c);

        int d = 10;
        int rc = d++;
        System.out.println(rc);
        System.out.println(d);
    }
}
