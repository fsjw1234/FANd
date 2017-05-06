package pers.fand.practice10;

public abstract class Demo3 {

	abstract void test();
	Demo3(){//首先执行构造方法
		System.out.println("before test()");
		test();
		System.out.println("after test()");
	}
	public static void main(String[] args){
		new Atest();
	}
}

class Atest extends Demo3{
	private int i=1;
	void test(){
		System.out.println("test()"+i);
	}
	public Atest(){
		System.out.println(i);
	}
}
