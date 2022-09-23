package com.arijeta.loop;

public class BreakDemo {
    public static void main(String[] args) {
        int []numbers={10,20,30,40,50};
        for(int x:numbers)
        {
            //x等于30时跳出循环
            if(x==30)
            {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}
