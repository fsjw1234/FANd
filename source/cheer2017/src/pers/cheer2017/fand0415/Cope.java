package pers.cheer2017.fand0415;

import java.util.Arrays;

public class Cope {
	public static void main(String[] args){
		int arr[]=new int[]{23,42,12};
		int array[]=Arrays.copyOf(arr,5);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
	}

}
