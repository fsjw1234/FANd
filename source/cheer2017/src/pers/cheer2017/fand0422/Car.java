package pers.cheer2017.fand0422;

public class Car {
	public static void main(String[] args){
	Vehicle c=new Vehicle();
	c.setSpeed(100);
	c.setSize(500);
	c.move();
	c.speedUp();
	c.speedDown();
	
}
}
class Vehicle{
	int speed;
	int size;
	public void move(){
		System.out.println("�����ٶ��ǣ� "+speed+"��������ǣ� "+size);
	}
	public int intgetSize(){
		return size;
	}
	public void setSize(int size){
		this.size=size;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void speedUp(){
		System.out.println("������");
	}
	
	public void speedDown(){
		System.out.println("������");
	}
}