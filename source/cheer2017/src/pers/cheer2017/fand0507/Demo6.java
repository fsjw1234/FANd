package pers.cheer2017.fand0507;

/*��ӡ������"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ���������
�磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���  

�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ*/

public class Demo6 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			if (isLotus(i))
				System.out.print(i + " ");
		}
		System.out.println();
	}
	//�ж�ˮ�ɻ���
	private static boolean isLotus(int lotus) {
		int m=0;
		int n=lotus;
		int sum=0;
		m= n/100;
		n=n-m*100;
		sum=m*m*m;
		m = n / 10;
		n =n- m * 10;
		sum =sum+m*m*m+n*n*n;
		if (sum == lotus)
			return true;
		else
			return false;
	}
}
