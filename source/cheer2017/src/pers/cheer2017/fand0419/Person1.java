package pers.cheer2017.fand0419;

public class Person1 {
	public String name;
	public String sex;
	public int age;
	
	public Person1(){
		System.out.println("��Ĭ�ϵĹ��췽������������");
	}
	public Person1(String name){
		System.out.println("�������Ĺ��췽��");
	}
	public void sleep(){
		System.out.println("˯��");
	}
	public void eat(){
		System.out.println("�Է�");
	}
	public static void main(String args[]){
		Person1 p=new Person1();
		Person1 p1=new Person1("FANDI"); 
		p.eat();
		p.sleep();
		p1.eat();
		p1.sleep();
	}

}
