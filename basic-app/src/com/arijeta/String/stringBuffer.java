package com.arijeta.String;

public class stringBuffer {
    public static void main(String[] args) {
        /*StringBuffer 类用于创建可变（可修改）字符串。
        Java 中的 StringBuffer 类与 String 类相同
        只是它是可变的，即可以更改。
        StringBuffer 类的重要构造函数
        StringBuffer()：创建一个初始容量为 16 的空字符串缓冲区。
        StringBuffer(String str)：用指定的字符串创建一个字符串缓冲区。
        StringBuffer(int capacity)：创建一个以指定容量为长度的空字符串缓冲区。

         */

        //1.append method
        //将给定的参数与该字符串连接起来
        StringBuffer sb=new StringBuffer("Hello, ");
        sb.append("JAVA");
        System.out.println(sb);

        //2.insert method
        //在给定位置插入带有此字符串的给定字符串

        StringBuffer sb2=new StringBuffer("I am ");
        sb2.insert(4," Arijeta");
        // Now original string is changed
        System.out.println(sb2);

        //3.replace method
        //replace() 方法从指定的 beginIndex 和 endIndex-1 替换给定的字符串。
        StringBuffer sb3=new StringBuffer("Hello");
        sb3.replace(0,3,"Java");
        System.out.println(sb3);

        //4.delete method
        //StringBuffer 类的 delete() 方法将字符串从指定的 beginIndex 删除到 endIndex-1。
        StringBuffer sb4=new StringBuffer("Hello");
        sb4.delete(0,2);//delet index[0]-index[1]
        System.out.println(sb4);




    }
}
