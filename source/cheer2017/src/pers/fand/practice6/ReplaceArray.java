package pers.fand.practice6;

import java.util.Arrays;

public class ReplaceArray {

	public static void main(String args[]){
		String[] arr1=new String[]{"dad","qw","gfg","w"};
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		
		Arrays.fill(arr1,2,3,"bb");
		
		for(int i=0;i<arr1.length;i++){
		System.out.print(arr1[i]+",");
		}
	}

}
