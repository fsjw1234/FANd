package pes.cheer2017.fand0508;

import java.util.Scanner;

/*���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��

���������(a>b)?a:b ����������������Ļ�������*/

public class Demo1 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("������ɼ���");
		int a=scan.nextInt();
		grade(a);
		scan.close();
	}

	private static void  grade(int n){
		if(n>100||n<0)
			System.out.println("����ķ�������ȷ");
		else{
			String str=(n>=90)?"�֣�����A��":((n>60)?"�֣�����B��":"�֣�����C��");
			System.out.println(n+str);
		}	
	}
}
