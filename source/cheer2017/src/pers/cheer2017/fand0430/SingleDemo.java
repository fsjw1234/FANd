package pers.cheer2017.fand0430;

public class SingleDemo {
	public static void main(String[] args){
		Single s=Single.getInstance();
		System.out.println(s.toString());
 	 }

}

class Single{
	private static Single s=new Single();
	private Single(){
		
	}
	public static Single getInstance(){
		return s;
	}
}