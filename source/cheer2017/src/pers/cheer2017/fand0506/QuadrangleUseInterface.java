package pers.cheer2017.fand0506;

interface drawTest{
	public void draw();
}
class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{
	public void draw(){
		System.out.println("ƽ���ı���.draw()");
	}
	void doAnyThing(){
		
	}
}
class SquareUseInterface extends QuadrangleUseInterface implements drawTest{
	public void draw(){
		System.out.println("������.draw()");
	}
	void doAnyThing(){
		
	}
}
class AnyThingUseInterface extends QuadrangleUseInterface{
	void doAnyThing(){
		
	}
}

public class QuadrangleUseInterface {
	void doAnyThing(){
		
	}
	public static void main(String[] args){
		drawTest[] d={new SquareUseInterface(),new ParallelogramgleUseInterface()};
		for(int i=0;i<d.length;i++){
			d[i].draw();
		}
	}

}
