package pers.cheer2017.fand0427;

class Qua{
	public static void draw(Qua q){
		
	}
}
class Squa extends Qua{
	
}
class Anything{
	
}

public class Para extends Qua{
	public static void main(String[] args){
		Qua q=new Qua();
		if(q instanceof Para){
			Para p=(Para)q;
		}
		/*if(q instanceof Squa){
			Suqa s=(Suqa)q;
		}*/
		
	}

}
