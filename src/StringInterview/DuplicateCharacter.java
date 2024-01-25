package StringInterview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "Khushboo, Yadav!";
		
		Map<Character, Integer> charCountMap = new HashMap<>();
		char[] charArray = inputString.toCharArray();
		
		for(char ch: charArray) {
			if(charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			}else {
				charCountMap.put(ch,  1);
			}
		}
		System.out.println("Repeated characters in the string: ");
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : "+ entry.getValue()+ "times");
			}
		}
		
	}

}
