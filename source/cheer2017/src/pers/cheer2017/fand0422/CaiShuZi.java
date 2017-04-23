package pers.cheer2017.fand0422;

import java.util.Scanner;

public class CaiShuZi {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("输入你想的数字： ");
		int a=scan.nextInt();
		new A(a);
		//System.out.println(re);
		scan.close();
	}
}
class A{
	int v=100;
	
	public A(int u){
		if(u==v){
			System.out.println("恭喜你 猜对了");
		}else if(u>v){
			System.out.println("猜的数字大于实际数字");
		}else{
			System.out.println("猜的数字小于实际数字");
		}
	}
	/**public String toString(){
		return v + "";
	}*/
}