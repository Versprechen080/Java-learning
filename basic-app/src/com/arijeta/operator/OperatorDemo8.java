package com.arijeta.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        //三元运算符
        double score=18;
        String rs=score>=60?"及格":"不及格";
        System.out.println(rs);

        //从三个数找出最大数
        int a = 50;
        int b = 78;
        int c = 24;

        int tempo_max=a>b?a:b;
        int final_max=tempo_max>c?tempo_max:c;
        System.out.println(final_max);

        //---------------------拓展---------------------
        //用一行代码找出三个数中的最大

        int rsMax1=a>b?a>c?a:c:b>c?b:c;
        System.out.println(rsMax1);

    }
}
