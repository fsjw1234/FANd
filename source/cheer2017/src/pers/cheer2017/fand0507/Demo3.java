package pers.cheer2017.fand0507;

/*�ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣�

���������
���ӵĹ���Ϊ����1,1,2,3,5,8,13,21....*/

public class Demo3 {
	public static void main(String[] args){
		int n=4;
		System.out.println("��"+n+"������������Ϊ"+fun(n));
	}
		
		private static int fun(int n){
			if(n==1||n==2)
				return 1;
			else
				return fun(n-1)+fun(n-2);
		}
	}