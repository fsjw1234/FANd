package pers.fand.practice5;

import java.util.Scanner;

public class UpperAndLower1 {
	public static void main(String[] args){
		Scanner str1=new Scanner(System.in);
		System.out.print("��������ַ�����");
		String str2=str1.next();
		//System.out.println(str2);
		String str3=str2.toUpperCase();
		System.out.println("�����Ӵ��Ĵ�дΪ"+str3);
		String str4=str2.toLowerCase();
		System.out.println("�����Ӵ���СдΪ"+str4);
		str1.close();
	}

}
