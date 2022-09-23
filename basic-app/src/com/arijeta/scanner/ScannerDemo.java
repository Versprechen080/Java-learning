package com.arijeta.scanner;

import java.util.Scanner;

//1.导包操作(不需要自己写，以后通过工具导入更方便
//import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        //键盘录入技术
        //2.得到一个键盘扫描器对象
        Scanner sc=new Scanner(System.in);

        //3.调用sc对象的功能等待接收用户输入的数据
        //这个代码会等待用户输入数据，直到用户输入完数据并按了回车键就把数据拿到
        System.out.println("请输入年龄：");
        int age=sc.nextInt();//nextInt接整数20
        System.out.println("您的年龄是：" + age);

        System.out.println("请输入姓名：");
        String name=sc.next();
        System.out.println("欢迎：" + name);

        String s=sc.nextLine();
        System.out.println("You entered string" +s);



    }
}
