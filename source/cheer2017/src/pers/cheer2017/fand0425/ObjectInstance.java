package pers.cheer2017.fand0425;

public class ObjectInstance {

	public String toString(){
		return "��"+getClass().getName()+"������дtoString����";
	}
	public static void main(String[] args){
		System.out.println(new ObjectInstance());
	}
}
