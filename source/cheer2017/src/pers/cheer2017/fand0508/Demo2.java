package pers.cheer2017.fand0508;

import java.util.Scanner;

/*����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����*/

public class Demo2 {
	public static void main(String[] args){
		System.out.println("������һ���ַ���");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		count(str);
	}
	
	private static void count(String str){
		String E1="[\u4e00-\u9fa5]";//����
		String E2="[a-zA-Z]";
		String E3="[0-9]";
		String E4="\\s";//�ո�
		int countChinese=0;
		int countLetter=0;
		int countNumber=0;
		int countSpace=0;
		int countOther=0;
		char[] array_Char=str.toCharArray();//���ַ���ת��Ϊ�ַ�����
		String[] array_String=new String[array_Char.length];//����ֻ����Ϊ�ַ�������
		for(int i=0;i<array_Char.length;i++)
			array_String[i]=String.valueOf(array_Char[i]);
		for(String s:array_String){
			if(s.matches(E1))
				countChinese++;
			else if(s.matches(E2))
				countLetter++;
			else if(s.matches(E3))
				countNumber++;
			else if(s.matches(E4))
				countSpace++;
			else
				countOther++;
		}
		System.out.println("����ĺ��ָ�����"+countChinese);
		System.out.println("�������ĸ������"+countLetter);
		System.out.println("��������ָ�����"+countNumber);
		System.out.println("����Ŀո������"+countSpace);
		System.out.println("����������ַ�������"+countOther);
	}

}
