package pers.cheer2017.fand0507;

/*�ж�101-200֮���ж��ٸ����������������������

����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ����������������������������֮������*/

public class Demo4 {
	public static void main(String[] args){
		int m=1;
		int n=300;
		int count=0;
		//ͳ����������
		for(int i=m;i<n;i++){
			if(isPrime(i)){
				count++;
				System.out.println(i);
				if(count%10==0){
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("��"+m+"��"+n+"֮�乲��"+count+"������");
	}
	//�ж�����
	private static boolean isPrime(int n){
		boolean flag=true;
		if(n==1){
			flag=false;
		}else{
			for(int i=2;i<=Math.sqrt(n);i++){
			//for(int i=2;i<n;i++){
				if(n%i==0||n==1){
					flag=false;
					break;
				}
				else{
					flag=true;
				}
			}
		}
		return flag;
	}
}