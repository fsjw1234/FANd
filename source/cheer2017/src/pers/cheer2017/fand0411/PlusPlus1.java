package pers.cheer2017.fand0411;

public class PlusPlus1 {
	public static void main(String args[]) {
		String[] array = new String[] { "aa", "bb", "cc" };
		for (int i = 0; i < array.length;) {
			String value = array[i++];
			System.out.println(i);
			System.out.println(value);
		}
	}

}
