package pers.cheer2017.fand0507;

public class Demo2 {
	public static void main(String[] args){
		Test test=new Test();
		System.out.println(test);
		
		String a="abc";
		System.out.println(a.hashCode());
	}
}

class Test{
	public String toString(){
		return "test";
	}
	
}