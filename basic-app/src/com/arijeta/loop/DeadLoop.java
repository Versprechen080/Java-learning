package com.arijeta.loop;

import java.util.Scanner;

public class DeadLoop {
    public static void main(String[] args) {
        int okpassword=520;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入正确的密码");
            int password = sc.nextInt();
            if(password==okpassword)
            {
                System.out.println("登录成功了");
                break;
            }
            else
            {
                System.out.println("密码错误");
            }
        }
    }
}
