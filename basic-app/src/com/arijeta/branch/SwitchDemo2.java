package com.arijeta.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //switch 分支结构
        String weekday="Wednesday";
        switch(weekday){//不支持double，float，long
            case"Monday":
                System.out.println("solve bugs");
                break;
            case"Tuesday":
                System.out.println("struggle with code");
                break;
            case"Wednesday":
                System.out.println("Time to rest");
                break;
            case"Thursday":
                System.out.println("compete with ddl");
                break;
            case"Friday":
                System.out.println("wait weekends");
                break;
        }
    }
}
