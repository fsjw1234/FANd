package pers.fand.practice6;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args){
		int[] arr1=new int[]{321312,31312,31231245,65656,76,878,79,12};
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		System.out.print(arr1[0]);
	}
}
