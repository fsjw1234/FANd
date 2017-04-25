package pers.cheer2017.fand0425;

public class Random {
public static int GetEvenNum(double num1,double num2){
	int s=(int)num1+(int)(Math.random()*(num2-num1));
	if(s%2==0){
		return s;
	}else{
		return s+1;
	}
}
public static void main(String args[]){
	System.out.println(GetEvenNum(2,32));
}
}
