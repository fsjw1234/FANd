package pers.fand.practice5;

public class Substr {
	public static void main(String[] args){
		String str1="abc ABCDEF";
		String str2="abc dejDEF";
		String str3=str1.substring(6,10);
		String str4=str2.substring(6,10);
		if(str3.equals(str4)){
			System.out.println("str3 �� str4�����Ӵ���ͬ");
		}else{
			System.out.println("str3 �� str4�����Ӵ�������ͬ");
		}
	}

}
