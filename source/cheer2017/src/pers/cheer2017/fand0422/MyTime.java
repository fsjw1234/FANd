package pers.cheer2017.fand0422;

public class MyTime {
public static void main(String[] args){
		Time sj=new Time(4,5,6);
		sj.display();
		sj.addSecond(3);
		sj.addHour(4);
		sj.addSecond(40);
		//sj.Time(7,10,45);
	}

}
class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	public Time() {
		// TODO Auto-generated constructor stub
	}

	public void display(){
		System.out.println(hour+" "+minute+" "+second);
	}
	public void addSecond(int second){
		second+=second;
		System.out.println(second);
	}
	public void addHour(int hour){
		hour=hour+10;
		System.out.println(hour);
	}
	public void addminute(int minute){
		minute+=minute;
		System.out.println(minute);
	}

}
