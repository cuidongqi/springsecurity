package mianshi;

public class StringMianshi {
	public static void main(String[] args) {
		String strTempA = new String("北明软件");
		String strTempB = strTempA;
		System.out.println(strTempA);//北明软件
		System.out.println(strTempB);//北明软件
		strTempA = "面试题";
		System.out.println(strTempA);//面试题
		System.out.println(strTempB);//北明软件
		if(strTempA == strTempB) {
			System.out.println("==");
		} else if(strTempA.equals(strTempB)) {
			System.out.println("equals");
		}
		System.out.println(strTempB);//北明软件
	}
}
