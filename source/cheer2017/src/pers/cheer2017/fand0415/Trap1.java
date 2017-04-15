package pers.cheer2017.fand0415;

public class Trap1 {
	public static void main(String[] args){
		int array[][]=new int[][]{{4,3},{1,2}};
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

}
