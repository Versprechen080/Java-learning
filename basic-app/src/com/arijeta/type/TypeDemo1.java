package com.arijeta.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        //理解自动类型转换
        byte a = 20;
        int b = a;//发生自动类型转换
        System.out.println(a);
        System.out.println(b);
        //类型范围小的变量，可以直接赋值给类型范围大的变量

        int age=23;
        double db=age;//发生自动类型转换
        System.out.println(db);

        char ch='a';
        int code = ch;
        System.out.println(code);//97
        System.out.println(ch);

    }
}
