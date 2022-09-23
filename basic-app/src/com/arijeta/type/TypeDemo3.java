package com.arijeta.type;

public class TypeDemo3 {
    public static void main(String[] args) {
        //理解强制类型转换，并使用
        int a = 20;
        byte b = (byte)a;
        System.out.println(b);
        System.out.println(a);

        int i = 1500;
        byte j=(byte)i;
        System.out.println(j);//-36

        double score=99.5;
        int it=(int)score;
        System.out.println(it);//99 直接截断小数保留整数
    }
}
