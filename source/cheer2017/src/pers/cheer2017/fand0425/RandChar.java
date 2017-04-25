package pers.cheer2017.fand0425;

public class RandChar {
	public static char GetRandomChar(char a,char b){
		return (char)(a+Math.random()*(b-a));
	}

	public static void main(String[] args){
		System.out.println(GetRandomChar('a','z'));
		System.out.println(GetRandomChar('A','Z'));
		System.out.println(GetRandomChar('0','9'));
	}
}
