package pers.cheer2017.fand0510;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("���������ѽ� ");
		int money=scan.nextInt();
		
		if(money>=50){
			System.out.println("�����������Ƿ�μ��Żݻ������Y  or  N��");
		}else{
			System.out.println("�����ϴ˴λ���������");
		}
		String b=scan.next();
		if(b.equals("Y")){
			System.out.println("���뻻�����������б����£�");
	
			if(money<100){
			System.out.println("1����50Ԫ����2Ԫ�������¿���һƿ��");
			}else if(money>=100&money<200){
				System.out.println("1����50Ԫ����2Ԫ�������¿���һƿ��");
				System.out.println("2����100Ԫ����3Ԫ�����ɿڿ���һƿ��");
				System.out.println("3����100Ԫ����10Ԫ����5������ۡ�");
			}else if(money>=200){
				System.out.println("1����50Ԫ����2Ԫ�������¿���һƿ��");
			    System.out.println("2����100Ԫ����3Ԫ�����ɿڿ���һƿ��");
			    System.out.println("3����150Ԫ����10Ԫ����5������ۡ�");
			    System.out.println("4����200Ԫ����15Ԫ����1���ղ������˹���");
			    System.out.println("5����250Ԫ����20Ԫ����ŷ����ˬ��ˮһƿ��");
			}
		}else{
			System.out.println("���μӻ����");
			System.exit(0);
		}
		System.out.println("�����������ѡ��ı�ţ� ");

		int num=scan.nextInt();
		switch(num){
		case 1:
			System.out.println("����Ҫ�����2Ԫ,�ſ��Ի����˼���Ʒ");
			break;
		case 2:
			System.out.println("����Ҫ�����3Ԫ,�ſ��Ի����˼���Ʒ");
			break;
		case 3:
			System.out.println("����Ҫ�����10Ԫ,�ſ��Ի����˼���Ʒ");
			break;
		case 4:
			System.out.println("����Ҫ�����15Ԫ,�ſ��Ի����˼���Ʒ");
			break;
		case 5:
			System.out.println("����Ҫ�����20Ԫ,�ſ��Ի����˼���Ʒ");
			break;
		}
	}

}
