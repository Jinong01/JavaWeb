package day09.it.ac.quiz;

import java.util.Arrays;

public class Quiz {

	public static String[] solution(String[] array) {
		
		String[] answer = new String[array.length];
		
		for(int i = 0; i < array.length; i++) {
			answer[i] = changeCase(array[i]);
		}
		
		return answer;
	}
	
	// 아직 String 자체를 대소문자 비교하거나 변경은 힘들고, char 배열로 분할하여 각각의 단어를 비교해서 변경해야한다.
	private static String changeCase(String input) {
		
		StringBuilder sb = new StringBuilder();
		
		// 문자열을 char 배열로 풀기
		char[] chArr = input.toCharArray();
		
		for(char ch : chArr) {
			// 소문자 -> 대문자
			if(Character.isLowerCase(ch)) {
				sb.append(Character.toUpperCase(ch));
				
				// 대문자 -> 소문자
			} else if(Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			}
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		
		String[] sentences = {"apple", "BANANA", "melon", "mango", "WATERMELON"};
		String[] answer = Quiz.solution(sentences);
		System.out.println(Arrays.toString(answer));
		
		
	}
	
}
