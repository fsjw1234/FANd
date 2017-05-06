package pers.fand.practice9;

public class Size {
	static double PI=3.14159;
	static double sum;
	public static double getSize(double r){
		return sum=PI*r*r;
	}
	
	public static void main(String[] args){
		double s=getSize(2);
		System.out.println(s);
	}

	

}
