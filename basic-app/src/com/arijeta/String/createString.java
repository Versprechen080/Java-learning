package com.arijeta.String;

public class createString {
    public static void main(String[] args) {
        //1.
        String s1=new String("example");
        System.out.println(s1);

        //2.
        String str="Geeks";
        System.out.println(str);

        //3.
        String str2=new String("Geekss");
        //if you want to store it in constant pool
        //you need to intern it
        String internedString=str2.intern();
        // 这会将字符串添加到字符串常量池中。
        System.out.println(str2);
        System.out.println(internedString);

    }
}
