package pers.cheer2017.fand0507;

interface USB{
	public void open();
	public void close();
}

public class BookPC {
	public static void main(String[] args){
		useUSB(new UPan());
		useUSB(new UsbMouse());
	}
	public static void useUSB(USB u){
		u.open();
		u.close();
	}
}
class UPan implements USB{
	public void open(){
		System.out.println("upan open");
	}
	public void close(){
		System.out.println("upan close");
	}
}
class UsbMouse implements USB{
	public void open(){
		System.out.println("usbmouse open");
	}
	public void close(){
		System.out.println("usbmouse close");
	}
}