package com.arijeta.Character;

public class CharacterDemo1 {
    public static void main(String[] args) {
        /* 装箱
        char ch='a';
        //Unicode字符表示形式
        char uniChar='\u039A';
        //字符数组
        char [] charArray={'a','b','c','d','e'};
        */

        //Character类
        //转义双引号
        System.out.println("访问\"菜鸟教程！\"");

        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isLowerCase('c'));

        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

        System.out.println(Character.toString('a'));

    }
}
