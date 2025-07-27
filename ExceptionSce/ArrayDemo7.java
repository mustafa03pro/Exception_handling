package com.mustafa.july14CustomException;


import java.util.Arrays;

public class ArrayDemo7 {

    public static void main(String[] args)
    {
        int []x = {145,222,138};
       
        int []y = maxEnd3(x);
        System.out.println("Return larger value :"+Arrays.toString(y));
    }
   
       public static int[] maxEnd3(int[] nums)
       {
        int larger = Math.max(nums[0], nums[2]);  //max is Math class static method
        System.out.println("larger value is :"+larger);
        nums[0] = larger;
        nums[1] = larger;
        nums[2] = larger;
        return nums;
       }

}
