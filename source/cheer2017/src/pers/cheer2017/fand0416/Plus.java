package pers.cheer2017.fand0416;

import java.util.Scanner;

public class Plus {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÄãµÄÊı×Ö£º");
		int a=scan.nextInt();
		System.out.println(a);
	
		//int temp1=0;
		int temp2=0;
	//	StringBuilder builder=new StringBuilder("");
		for(int i=1;i<=a;i++){
		//String str1=builder.append(i).toString();
		
		//	temp1=Integer.parseInt(str1);
		    temp2 = i+temp2;
		}
		//System.out.println(temp1);
		System.out.println(temp2);
		scan.close();
		
		
	}

}
