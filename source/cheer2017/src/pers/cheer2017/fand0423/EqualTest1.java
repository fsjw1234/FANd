package pers.cheer2017.fand0423;

public class EqualTest1 {


		private Long longValue;
		private Integer intValue;
		private Character charValue;
		
		

		public Long getLongValue() {
			return longValue;
		}



		public void setLongValue(Long longValue) {
			this.longValue = longValue;
		}



		public Integer getIntValue() {
			return intValue;
		}



		public void setIntValue(Integer intValue) {
			this.intValue = intValue;
		}



		public Character getCharValue() {
			return charValue;
		}



		public void setCharValue(Character charValue) {
			this.charValue = charValue;
		}

		public boolean equals(EqualTest1 obj){
			return (this==obj);
			
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			EqualTest1 test1=new EqualTest1();
			EqualTest1 test2=new EqualTest1();
			
			EqualTest1 test3=new EqualTest1();
			EqualTest1 test4=test3;
			
			System.out.println(test3);
			System.out.println(test4);
			
			if(test1==test2){
				System.out.println("这句话输出不了");
			}else{
				System.out.println("啥子");
			}
			System.out.println(test1);
			System.out.println(test2);
			
	}

}
