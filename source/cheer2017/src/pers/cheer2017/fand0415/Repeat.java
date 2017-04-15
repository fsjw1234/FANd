package pers.cheer2017.fand0415;

import java.util.Arrays;

public class Repeat {
	public static void main(String[] args){
		int arr[]=new int[]{23,42,12,85,10};
		int array[]=Arrays.copyOfRange(arr, 0, 3);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}
