package com.arijeta.Array;

public class jaggedArray {
    public static void main(String[] args) {
        //数组中的数组
        //创建一个二维数组，但每行的列数是可变的

        // Declaring 2-D array with 2 rows
        int arr[][]=new int[2][];
        // Making the above array Jagged

        // First row has 3 columns
        arr[0]=new int[3];

        // Second row has 2 columns
        arr[1]=new int[2];

        // Initializing array
        int count=0;
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]=count++;
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        //call function test
        jaggedArray.print();
        jaggedArray.test();
    }
    public static void test()
    {
        int r=5;

        // Declaring 2-D array with 5 rows
        int arr[][] = new int[r][];

        // Creating a 2D array such that first row
        // has 1 element, second row has two
        // elements and so on.
        for(int i=0;i<arr.length;i++)
            arr[i]=new int[i+1];

        // Initializing array
        int count=0;
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]=count++;
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    public static void print()
    {
        System.out.println("hello");
    }

}
