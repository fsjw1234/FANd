package pers.fand.practice9;

public class Demo {

	public static void SJ(int a, int b) {//限定6次循环，每次生成一个偶数
		int sum = 0;
		for (int i = 1; i <= 6; i++) {
		int x = (int) (b + (a - b) * Math.random());//生成随机数
		if ((x % 2 == 0) && (x != 32)) {//随机数是偶数，而且不能是32
		System.out.print("第" + i + "次生成的随机数是:" + x+",");
		sum = sum + x;
		} else {
		x=x+1;//如果生成的随机是奇数，那么给它加1，变成偶数，再赋值回去
		sum=sum+x;
		System.out.print("第" + i + "次生成的数是:" + x + ",");
		}
		System.out.println("前" + i + "个随机数之和是:" + sum+"。");
		}
		}

		public static void main(String[] args) {
		SJ(32, 2);
		} 
}
