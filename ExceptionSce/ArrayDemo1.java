package com.mustafa.july14CustomException;


public class ArrayDemo1  
{
    public static void main(String[] args)
    {
        int []x = {19,78,45,89,15};
       
        boolean b = firstLast(x);
        System.out.println("15 is available :"+b);
    }
       
   
    public static boolean firstLast(int[] nums)
    {
        if (nums[0] == 15 || nums[nums.length-1] == 15)
            return true;
        else
            return false;
    }
}