package com.arijeta.loop;

public class LoopNesting {
    public static void main(String[] args) {
        //循环嵌套
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("你安全吗");
            }
            System.out.println("你猜");
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("*");//print不换行 println换行
            }
            System.out.println();//换行
        }
    }
}
