package com.arijeta.operator;

public class OperatorTest2 {
    public static void main(String[] args) {
        //拆分3位数，个十百位分别输出
        int data=724;

        //1.个位
        int ge = data % 10;
        System.out.println(ge);

        //2.十位
        int shi = (data - ge) / 10 % 10;//int shi=data/10%10;
        System.out.println(shi);

        //3.百位
        int bai = (data - ge - shi * 10)  / 100;//int bai=data/100;
        System.out.println(bai);
    }
}
