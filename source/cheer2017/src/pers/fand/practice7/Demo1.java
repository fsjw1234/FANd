package pers.fand.practice7;

public class Demo1 {
	public static void main(String[] args){
		int a=args.length;
		if(a==0){
			System.out.println("�����в���");
		}else{
			for(int i=1;i<=args.length;i++){
				System.out.println(i);
			}
		}
	}

}
