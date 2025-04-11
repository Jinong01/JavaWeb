package day09.it.ac.quiz;

import java.util.Arrays;
import java.util.Scanner;

import javax.management.MBeanServer;

public class FindNumber {
	
	public static int solution(int n, int w, int num) {
		int answer = 0;
		// 최종번호(총 박스 수) = n, 한 줄의 박스 갯수 = w, 찾을 번호 = num
		// ceil 은 올림처리 
		int line = (int)(Math.ceil( (double)n/w ));
		int remind = (n%w)-1;
		
		int[][] box = new int[line][w];
		int count =1;
		
		loop:
		
			for(int i =0; i<line; i++) {
				
				if(i%2 == 0) {
					for(int j =0; j<w; j++) {
						box[i][j] = count++;
						if(count > n) {
							break loop;
						}
					}
				} else {
					
					for(int j =w-1; j>=0; j--) {
						box[i][j] = count++;
						
						if(count > n) {
							break loop;
						}
						
					}
					
				}
			}
		
		
		for(int i=line-1; i >=0; i--) {
			System.out.println(Arrays.toString(box[i]));
		}
		
		for(int i =line-1; i>=0; i--) {
			for(int j = 0; j<w; j++) {
				if(box[i][j] !=0 && box[i][j] ==num) {
					answer = line-i;
					if(box[line-1][j] == 0) {
						answer = answer -1;
					} 
				}
			}
		}
		
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		FindNumber.solution(38, 6, 16);
	}

}
