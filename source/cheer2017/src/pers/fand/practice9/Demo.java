package pers.fand.practice9;

public class Demo {

	public static void SJ(int a, int b) {//�޶�6��ѭ����ÿ������һ��ż��
		int sum = 0;
		for (int i = 1; i <= 6; i++) {
		int x = (int) (b + (a - b) * Math.random());//���������
		if ((x % 2 == 0) && (x != 32)) {//�������ż�������Ҳ�����32
		System.out.print("��" + i + "�����ɵ��������:" + x+",");
		sum = sum + x;
		} else {
		x=x+1;//������ɵ��������������ô������1�����ż�����ٸ�ֵ��ȥ
		sum=sum+x;
		System.out.print("��" + i + "�����ɵ�����:" + x + ",");
		}
		System.out.println("ǰ" + i + "�������֮����:" + sum+"��");
		}
		}

		public static void main(String[] args) {
		SJ(32, 2);
		} 
}
