package pers.cheer2017.fand0506;

public class Quadrangle {
	private Quadrangle[] qtest=new Quadrangle[6];
	private int nextIndex=0;
	public void draw(Quadrangle q){
		if(nextIndex<qtest.length){
			qtest[nextIndex]=q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	public static void main(String[] args){
		Quadrangle q=new Quadrangle();
		q.draw(new Square());
		q.draw(new Parallelogramgle());
	}
}

class Square extends Quadrangle{
	public Square(){
		System.out.println("正方形");
	}
}
class Parallelogramgle extends Quadrangle{
	public Parallelogramgle(){
		System.out.println("平行四边形");
	}
}
