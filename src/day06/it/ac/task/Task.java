package day06.it.ac.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		List<Integer> lotto = new ArrayList<>();
		int bonus;
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		// 로또 번호 추첨
		for (int i = 0; i < 6; i++) {
			int val = rand.nextInt(45) +1;
			if(lotto.contains(val)) {
				i--;
				continue;
			}
			
			lotto.add(val);
		}
		Collections.sort(lotto);
		
		// 보너스 번호 추첨
		bonus = rand.nextInt(45) +1;
		if(lotto.contains(bonus)) {
			bonus = rand.nextInt(45) +1;
		}
		
		// 내 번호 적기
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.println(i+1 + "번째 번호 : ");
			int num = scan.nextInt();
			if(list.contains(num)) {
				i--;
				continue;
			}
			
			list.add(num);
			
		}
		Collections.sort(list);
		
		System.out.println("로또 번호 : " + lotto + ", 보너스 번호 : " + bonus);
		System.out.println("내 번호 : " + list);
		
		// 번호 맞추기
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(lotto.contains(list.get(i))) {
				result.add(list.get(i));
			}
		}
		Collections.sort(result);
		
		// 결과
		String rank;
		if(result.size() == 6) {
			rank = "1등";
		} else if(result.size() == 5 && result.contains(bonus)) {
			rank = "2등";
		} else if(result.size() == 5) {
			rank = "3등";
		} else if(result.size() == 4) {
			rank = "4등";
		} else if(result.size() == 3) {
			rank = "5등";
		} else {rank = "꽝";}
		
		System.out.println("맞은 번호 : " + result + "등수 : " + rank);
	}
}
