package pers.cheer2017.fand0422;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String args[]) throws Exception{
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(df);
		System.out.println(df.format(new Date()));
		
		Date _data=df.parse("22/04/2017 16:30:31");
		System.out.println(df.format(_data));
	}

}
