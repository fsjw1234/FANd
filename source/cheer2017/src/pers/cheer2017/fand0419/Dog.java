package pers.cheer2017.fand0419;

public class Dog {
	int a=21;
	int b=12;
	public Dog(){
		this(23,43);
	}
	public Dog(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
	public void add(){
		int c=this.a+this.b;
		System.out.println(c);
	}
	
	public static void main(String[] args){
		Dog d=new Dog();
		d.add();
	}

}
