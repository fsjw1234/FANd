package pers.cheer2017.fand0510;

class Fu{
	int num=3;
}
//����ֻ�����ں����ϣ��������޹�

class Zi extends Fu{
	int num=4;
}

public class Demo4 {
	public static void main(String[] args){
		Fu f=new Zi();
		System.out.println(f.num);
	}

}
