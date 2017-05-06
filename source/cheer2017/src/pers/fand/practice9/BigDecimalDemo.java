package pers.fand.practice9;

import java.math.BigDecimal;

public class BigDecimalDemo {
	
	static final int location=10;
	public BigDecimal add(double value1,double value2){
		BigDecimal b1=new BigDecimal(Double.toString(value1));
		BigDecimal b2=new BigDecimal(Double.toString(value2));
		return b1.add(b2);
	}
	
	public BigDecimal sub(double value1,double value2){
		BigDecimal b1=new BigDecimal(Double.toString(value1));
		BigDecimal b2=new BigDecimal(Double.toString(value2));
		return b1.subtract(b2);
	}

	public BigDecimal mul(double value1,double value2){
		BigDecimal b1=new BigDecimal(Double.toString(value1));
		BigDecimal b2=new BigDecimal(Double.toString(value2));
		return b1.multiply(b2);
	}
	
	public static void main(String[] args){
		BigDecimalDemo b=new BigDecimalDemo();
		System.out.println("两个数字相加结果： "+b.add(-7.5, 8.9));
		System.out.println("两个数字相减结果： "+b.sub(-7.5, 8.9));
		System.out.println("两个数字相乘结果： "+b.mul(-7.5, 8.9));
	}
}
