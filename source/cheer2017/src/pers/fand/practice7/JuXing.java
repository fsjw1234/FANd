package pers.fand.practice7;

class Shap {
	int chang;
	int kuan;
	public void Size(){
			System.out.println("该矩形的面积是： "+chang*kuan);
		}
	
	public int getChang() {
		return chang;
	}
	public void setChang(int chang) {
		this.chang = chang;
	}

	public int getKuan() {
		return kuan;
	}
	public void setKuan(int kuan) {
		this.kuan = kuan;
	}

	
}
class JuXing{
	public static void main(String[] args){
		Shap a=new Shap();
		a.setChang(9);
		a.setKuan(6);
		a.Size();
	}

}
