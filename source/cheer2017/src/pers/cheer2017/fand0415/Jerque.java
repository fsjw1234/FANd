package pers.cheer2017.fand0415;

public class Jerque {
	public static void main(String[] args){
		String str="";
		long startTime=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			str=str+i;
		}
		long endTime=System.currentTimeMillis();
		long time=endTime-startTime;
		System.out.println("消耗的是时间"+time);
		
		StringBuilder builder=new StringBuilder("");
		startTime=System.currentTimeMillis();
		for(int j=0;j<10000;j++){
			builder.append(j);
		}
			endTime=System.currentTimeMillis();
			time=endTime-startTime;
	    System.out.println("消耗的是时间"+time);
	}

}
