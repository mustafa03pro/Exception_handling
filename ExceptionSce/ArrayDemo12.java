package com.mustafa.july14CustomException;


import java.util.Arrays;

public class ArrayDemo12 {

    public static void main(String[] args)
    {
        int []arr = {12,89,90,78,99, 56, 99};
       
        int []newArray =  midThree(arr);
        System.out.println("New Array Elements are :"+Arrays.toString(newArray));
        System.out.println(Arrays.toString(arr));
    }
    public static int[] midThree(int[] nums)
    {
        int[] myArray = new int[3];
       
        int middle = nums.length / 2;
       
        myArray[0] = nums[middle-1];
        myArray[1] = nums[middle];
        myArray[2] = nums[middle+1];
        return myArray;
    }
}

