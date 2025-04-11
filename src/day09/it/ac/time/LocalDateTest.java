package day09.it.ac.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

	public static void main(String[] args) {

		// LocalDate 는 연/월/일 형식으로 시간을 표현한다.
		// 포맷을 따로 안주면 ISO-8601 > yyyy-mm-dd 형식으로 나옴
		
		// 현재 시간(날짜) 가져오기
		LocalDate today = LocalDate.now();
		System.out.println("오늘 : " + today);
		
		// 특정 날짜 만들기
		LocalDate date = LocalDate.of(2025, 4, 11);
		System.out.println("날짜 : " + date);
		
		// 시간포맷 설정
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date02 = LocalDate.parse("2025-01-01", formatter);
		
		System.out.println("날짜 : " + date02);
		
		// 시간을 > String 으로
		String dateStr = today.format(formatter);
		System.out.println("LocalDate to String : " + dateStr);
		
		// 날짜 더하기
		LocalDate nextDay = today.plusDays(1);
		System.out.println("nextDay : " + nextDay);
		
		// 날짜 빼기
		LocalDate preDay = today.minusDays(1);
		System.out.println("preDay : " + preDay);
		
		// 현재날짜가 기준날짜 이전인가?
		LocalDate target = LocalDate.of(2025, 4, 9);
		if(target.isBefore(LocalDate.now())) {
			System.out.println("날짜는 오늘보다 이전이다.");
		}
		
		// 현재날짜가 기준날짜 이후인가?
		if(target.isAfter(LocalDate.now())) {
			System.out.println("날짜는 오늘보다 이후이다.");
		}
		
		// 현재날짜가 기준날짜와 같은가?
		if(target.isEqual(LocalDate.now())) {
			System.out.println("날짜는 이다.");
		}
	}

}
