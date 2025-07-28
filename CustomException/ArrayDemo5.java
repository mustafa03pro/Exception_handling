package com.mustafa.july15CustomException;

import java.util.Arrays;

public class ArrayDemo5 {

	public static void main(String[] args) {
		int arr[]= {12,34,4,65,76};
		System.out.println("the original array: "+Arrays.toString(arr));
		int []resarray=ChangeArray.changeArrayElement(arr);
		System.out.println("after change:"+Arrays.toString(arr));

	}
	class ChangeArray{
		public static int[] changeArrayElement(int []p) {
			p[0] = 100;
		       p[1] = 200;
		       
		       return p;
			
		}
	}

}
