package pers.fand.practice6;

import java.util.Arrays;

public class FzSz {
	public static void main(String args[]){
		int arr1[]=new int[]{434,323,54,2123,5456,6565};
		
		int arr2[]=Arrays.copyOfRange(arr1,0,3);
		
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+",");
		}
	}

}
