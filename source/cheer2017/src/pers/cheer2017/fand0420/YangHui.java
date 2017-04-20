package pers.cheer2017.fand0420;
public class YangHui {
	public static void main(String[] args){
	int arr1[][]=new int[5][];
    for (int i = 0; i < arr1.length; i++) {
       arr1[i]=new int[i+1];
        for(int j=0;j<=i;j++){
            
            if(i==0||j==0||j==i){
                arr1[i][j]=1;
            }else{
                arr1[i][j]=arr1[i-1][j]+arr1[i-1][j-1];
            }
            System.out.print(arr1[i][j]+" ");    
        }
        System.out.println();       
    }
	}
}
