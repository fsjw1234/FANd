package pers.fand.practice7;

public class JuXing1 {
	public static void main(String args[]){
	shap1 a=new shap1();
	a.getSize();
	}
}

class shap1{
	int chang;
	int kuan;
	public void getSize(){
		System.out.println("�þ��ε�����ǣ� "+chang*kuan);
	}
	
	public shap1(){
		chang=10;
		kuan=5;
	}
}