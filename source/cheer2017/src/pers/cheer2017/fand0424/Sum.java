package pers.cheer2017.fand0424;

public class Sum {
	public static void main(String[] args){
		String str[]={"21","21","21"};
		int sum=0;
		for(int i=0;i<str.length;i++){
			int myInt=Integer.parseInt(str[i]);
			sum=sum+myInt;
			
		}
		System.out.println(sum);
	}

}
