package pers.cheer2017.fand0506;

class Parent{
	Parent(){
		System.out.println("���ø����Parent�������췽��");
	}
}
class SubParent extends Parent{
	SubParent(){
		System.out.println("���������SubParent�������췽��");
	}
}

public class Subroutine extends SubParent{
	Subroutine(){
		System.out.println("���������Subroutine()���췽��");
	}
	public static void main(String[] args){
		Subroutine s=new Subroutine();
	}
}
