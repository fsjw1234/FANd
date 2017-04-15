package pers.cheer2017.fand0415;

import java.util.Date;

public class Eval {
	public static void main(String[] args){
		Date date=new Date();
		String year=String.format("%tY", date);
		String month=String.format("%tB", date);
		String day=String.format("%td", date);
		String time=String.format("%tc",date);
		String form=String.format("%tF",date);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(time);
		System.out.println(form);
	}

}
