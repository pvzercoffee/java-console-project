package com.pvzer;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = {8,45,2,10,18,98,74,3};

        for(int i=0;i<arr.length;i++)
        {
            for(int j = arr.length-2;j >= i;j--)
            {
                if(arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int result:arr)
        {
            System.out.print(result + " ");
        }
    }
}