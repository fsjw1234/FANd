package pers.cheer2017.fand0422;

import java.util.Scanner;

public class CaiShuZi {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("������������֣� ");
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
			System.out.println("��ϲ�� �¶���");
		}else if(u>v){
			System.out.println("�µ����ִ���ʵ������");
		}else{
			System.out.println("�µ�����С��ʵ������");
		}
	}
	/**public String toString(){
		return v + "";
	}*/
}