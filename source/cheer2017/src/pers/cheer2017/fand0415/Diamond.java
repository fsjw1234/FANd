package pers.cheer2017.fand0415;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("输入菱形的边长：");
		int width = scan.nextInt();
		System.out.println(width);
		for(int i=1;i<=width;i++){
			int start=width-i+1;
			int end=width+i-1;
			for(int j=1;j<=end;j++){
			//if(j==start || j==end){
				if(j>=start& j<=end){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			}System.out.println();
		}

		for(int i=2;i<=width;i++){
			int start=i;
			int end=2*width-i;
			for(int j=1;j<=end;j++){
			//if(j==start || j==end){
				if(j>=start&j<=end){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			}System.out.println();
		}
		scan.close();
	}
}
