package pers.fand.practice8;

public class Demo1 {
	public static void main(String[] args){
		Character char1=new Character('h');
		Character char2=new Character('H');
		boolean b=char1.equals(char2);
		System.out.println("char1��char2�Ƿ���� "+b);
		Character char3=Character.toLowerCase(char1);
		Character char4=Character.toLowerCase(char2);
		boolean c=char3.equals(char4);
		System.out.println("char3��char4�Ƿ���� "+c);
	}

}
