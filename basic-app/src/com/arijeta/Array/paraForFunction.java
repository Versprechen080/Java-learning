package com.arijeta.Array;

public class paraForFunction {
    public static void main(String[] args) {
        //数组作为参数传递给方法
        printArray(new int[]{3, 1, 2, 6, 4, 2});

    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //数组作为函数的返回值
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
