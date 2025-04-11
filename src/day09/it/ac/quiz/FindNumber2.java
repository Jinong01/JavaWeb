package day09.it.ac.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindNumber2 {

	public static int[] solution(int[] array, int[][] commands) {
		
		
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			int start = commands[i][0] -1;
			int end = commands[i][1];
			int position = commands[i][2] -1;
			
			// 배열 복사
//			int[] selectedArr = Arrays.copyOfRange(array, start, end); // start <= x < end
//			Arrays.sort(selectedArr);
			
//			answer[i] = selectedArr[position];
			
			List<Integer> list = new ArrayList<>();
			for(int j = start; j < end; j++) {
				list.add(array[j]);
			}
			
			Collections.sort(list);
			answer[i] = list.get(position);

		}
		
		
		
		return answer;
	}
	public static void main(String[] args) {
		
		int[] arr =  {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = FindNumber2.solution(arr, commands);
		System.out.println(Arrays.toString(result));
		
	}
}
