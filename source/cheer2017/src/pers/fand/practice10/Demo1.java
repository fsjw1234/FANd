package pers.fand.practice10;

public class Demo1 {
	public void doSomething(){
		System.out.println("����.doSomething()");
	}
	public void doAnything(){
		System.out.println("����.doAnything()");
	}
	public static void main(String[] args){
		Demo1 d=new sub();
		d.doSomething();
		d.doAnything();
	}
}
class sub extends Demo1{
	public void doAnything(){
		System.out.println("����.doAnything()");
	}
}
