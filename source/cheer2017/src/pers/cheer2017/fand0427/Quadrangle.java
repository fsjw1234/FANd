package pers.cheer2017.fand0427;

public class Quadrangle {
	private Quadrangle[] qtest=new Quadrangle[6];
	private int nextindex=0;
	public void draw(Quadrangle q){
		if(nextindex<qtest.length){
			qtest[nextindex]=q;
			System.out.println(nextindex);
			nextindex++;
		}
	}
	public static void main(String[] args){
		Quadrangle q=new Quadrangle();
		q.draw(new Square());
		q.draw(new Parallelogramgle());
		q.draw(new LingXing());
		q.draw(new TiXing());
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
class LingXing extends Quadrangle{
	public LingXing(){
		System.out.println("菱形");
	}
}
class TiXing extends Quadrangle{
	public TiXing(){
		System.out.println("梯形");
	}
}