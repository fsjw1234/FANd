package pers.cheer2017.fand0419;

public class Dog1 {
	int a=21;
	int b=12;
	public Dog1(){
		this(23,43);
	}
	public Dog1(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
	public void add(){
		int c=this.a+this.b;
		System.out.println(c);
	}
	public void setA(int a){
		this.a=a;
	}
	public int getA(){
		return a;
	}
	public static void main(String[] args){
		Dog1 d=new Dog1();
		d.add();
		d.setA(44);
		int dd=d.getA();
		System.out.println(dd);
	}

}
