package pers.cheer2017.fand0423;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class getClassTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
SimpleDateFormat sdf=new SimpleDateFormat();
System.out.println(sdf);
System.out.println(sdf.getClass().getName());

DateFormat df=new SimpleDateFormat();
System.out.println(df);
System.out.println(df.getClass().getName());

SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
System.out.println(f);
System.out.println(f.getClass().getName());

Object o=new SimpleDateFormat("yyyy-MM-dd");
System.out.println(o.getClass().getName());

Object oo=new DecimalFormat("#.00");
formatPrint(0,"2017-04-23");
formatPrint(oo,1111222.1114333d);

	}

	private static void formatPrint(Object f,Object data)throws Exception {
		// TODO Auto-generated method stub
		System.out.println(f.getClass().getName());
		System.out.println(data.getClass().getName());
		
		if(f instanceof DateFormat
			|| f instanceof SimpleDateFormat){
				DateFormat formatter=(DateFormat) f;
				if(data instanceof String){
					String date=(String)data;
							System.out.println(formatter.parse(date));
				}
			}else if(f instanceof NumberFormat||f instanceof DecimalFormat){
				DecimalFormat formatter=(DecimalFormat)f;
				if(data instanceof Number){
							System.out.println(formatter.format(data));
			}
		}
	}
}


