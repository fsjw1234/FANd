package pers.cheer2017.fand0506;

public class ObjectInstance {
	public String toString(){
		return "在"+getClass().getName()+"类中重写toString()方法";
	}
	public static void main(String[] args){
		System.out.print(new ObjectInstance());
	}

}
