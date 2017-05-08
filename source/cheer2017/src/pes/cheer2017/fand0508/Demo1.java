package pes.cheer2017.fand0508;

import java.util.Scanner;

/*利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。

程序分析：(a>b)?a:b 。这是条件运算符的基本例子*/

public class Demo1 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入成绩：");
		int a=scan.nextInt();
		grade(a);
		scan.close();
	}

	private static void  grade(int n){
		if(n>100||n<0)
			System.out.println("输入的分数不正确");
		else{
			String str=(n>=90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于C等");
			System.out.println(n+str);
		}	
	}
}
