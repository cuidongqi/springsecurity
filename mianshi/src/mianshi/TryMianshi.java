package mianshi;

import java.util.List;

public class TryMianshi {
	public static boolean main(String[] args) {
		try {
			List<Object> array;
			System.out.println(array.size());
			return true;
		} catch(Exception e) {
			System.out.println("error");
			return true;
		} finally {
			System.out.println("finally");
			return false;
		}
	}
}
