package pers.cheer2017.fand0425;

class Parent{
	Parent(){
		System.out.println("调用父类的Parent（）构造方法");
	}
}
class SubParent extends Parent{
	SubParent(){
		System.out.println("调用子类的SubParent（）构造方法");
	}
}
public class Subroutine extends SubParent{
	Subroutine(){
		System.out.println("调用子类的Subroutine（）的构造方法");
	}
	public static void main(String[] args){
		Subroutine s=new Subroutine();
	}
}
