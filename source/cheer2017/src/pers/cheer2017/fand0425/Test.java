package pers.cheer2017.fand0425;

class Test {
	public Test(){
		
	}
	protected void doSomething(){
		
	}
	protected Test dolt(){
		return new Test();
	}
}
class Test2 extends Test{
	public Test2(){
		super();
		super.doSomething();
	}
	public void doSomethingnew(){
		
	}
	public void doSomething(){
		
	}
	protected Test2 dolt(){
		return new Test2();
	}
}