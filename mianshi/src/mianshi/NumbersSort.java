package mianshi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumbersSort {
	
	public static Map<Integer, Integer> countNumbers(int[] numbers) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<numbers.length; i++) {
			int temp = numbers[i];
			for(Entry<Integer, Integer> entry: map.entrySet()) {
				if(temp == entry.getKey()) {
					break;
				}
			}
			int count = 0;
			for(int j=0; j<numbers.length; j++) {
				if(temp == numbers[j]) {
					count++;
				}
			}
			map.put(temp, count);
		}
		return map;
	}
	
	public static void main(String[] args) {
		int[] numbers = {11, 12, 13, 14, 11, 11, 11, 11};
		Map<Integer, Integer> countNumbers = countNumbers(numbers);
		for(Entry<Integer, Integer> entry: countNumbers.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
