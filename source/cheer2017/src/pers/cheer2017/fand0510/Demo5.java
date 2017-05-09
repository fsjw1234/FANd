package pers.cheer2017.fand0510;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入消费金额： ");
		int money=scan.nextInt();
		
		if(money>=50){
			System.out.println("满足条件，是否参加优惠换购活动：Y  or  N。");
		}else{
			System.out.println("不符合此次换购条件。");
		}
		String b=scan.next();
		if(b.equals("Y")){
			System.out.println("参与换购活动，换购活动列表如下：");
	
			if(money<100){
			System.out.println("1：满50元，加2元换购百事可乐一瓶。");
			}else if(money>=100&money<200){
				System.out.println("1：满50元，加2元换购百事可乐一瓶。");
				System.out.println("2：满100元，加3元换购可口可乐一瓶。");
				System.out.println("3：满100元，加10元换购5公斤面粉。");
			}else if(money>=200){
				System.out.println("1：满50元，加2元换购百事可乐一瓶。");
			    System.out.println("2：满100元，加3元换购可口可乐一瓶。");
			    System.out.println("3：满150元，加10元换购5公斤面粉。");
			    System.out.println("4：满200元，加15元换购1个苏泊尔炒菜锅。");
			    System.out.println("5：满250元，加20元换购欧莱雅爽肤水一瓶。");
			}
		}else{
			System.out.println("不参加换购活动");
			System.exit(0);
		}
		System.out.println("请输入你的所选择的编号： ");

		int num=scan.nextInt();
		switch(num){
		case 1:
			System.out.println("你需要再添加2元,才可以换购此件商品");
			break;
		case 2:
			System.out.println("你需要再添加3元,才可以换购此件商品");
			break;
		case 3:
			System.out.println("你需要再添加10元,才可以换购此件商品");
			break;
		case 4:
			System.out.println("你需要再添加15元,才可以换购此件商品");
			break;
		case 5:
			System.out.println("你需要再添加20元,才可以换购此件商品");
			break;
		}
	}

}
