package pers.cheer2017.fand0419;

public class Person {
	public String name;
	public String sex;
	public int age;
	public void sleep(){
		System.out.println("ÈËÆ£¾ëµÄÊ±ºòÏ²»¶Ë¯¾õ");
	}
	public void eat(){
		System.out.println("ÈË¼¢¶öµÄÊ±ºòÏ²»¶³Ô·¹");
	}
	public static void main(String[] args){
		Person p=new Person();
		p.eat();
		p.sleep();
	}

}
