package pers.cheer2017.fand0417;

import java.util.Scanner;

public class ZhiShu {
	public static boolean isZs(int number){
		boolean result=false;
		//if(number==2){
			//result= true;
			if(number>2){
				for(int i=2;i<number;i++){
					if(number%i==0){
						result=false;
						break;
					}else{
						result=true;
					}
				}
			}
		return result;
	}
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.print("������һ�����֣� ");
	int a=scan.nextInt();
	boolean re=isZs(a);
	System.out.println(a+"�Ƿ�λ������"+re);
	scan.close();
}
}
