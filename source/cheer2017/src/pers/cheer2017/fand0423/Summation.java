package pers.cheer2017.fand0423;

public class Summation {
	public static void main(String[] args){
		String str[]={"21","43","767","5","4"};
		int sum=0;
		for(int i=0;i<str.length;i++){
			int myint=Integer.parseInt(str[i]);
			//System.out.print(myint+",");
			//System.out.println(sum+=myint);
			sum=sum+myint;
			
		}
		System.out.println(sum);
	}
}
