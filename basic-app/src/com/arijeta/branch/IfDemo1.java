package com.arijeta.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        int heartBeat = 90;
        if(heartBeat<60||heartBeat>100)
        {
            System.out.println("您的心跳数据是："+heartBeat+",您可能需要进一步检查。");
        }
        else
        {
            System.out.println("您的心跳数据是："+heartBeat+",您非常健康。");
        }

    }
}
