package pers.fand.practice6;

public class Matrix {
	public static void main(String[] args){
		int arr1[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("�����е�Ԫ���ǣ� ");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]);
				
			}System.out.println();
		}
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[j][i]);
				
			}System.out.println();
		}
		
	}

}
