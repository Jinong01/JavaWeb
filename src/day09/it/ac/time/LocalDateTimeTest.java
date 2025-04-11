package day09.it.ac.time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {

		// 오늘날짜 출력
		LocalDateTime now = LocalDateTime.now();
		System.out.println("오늘 날짜 : " + now);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String nowDate = now.format(formatter);
		System.out.println("오늘 날짜 : " + nowDate);
		
		// DateTime -> String 로 변경할때는 부분 출력 가능하지만 String -> DateTime 으로 변경할때는 모든 형식이 다 있어야함
//		LocalDateTime parse = LocalDateTime.parse("2025-04-11", DateTimeFormatter.ofPattern("yyyy-MM-dd")); -> 오류
		LocalDateTime parse = LocalDateTime.parse("2025-04-11 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("오늘 날짜 : " + parse);
		
		// 시간 만들기
		LocalDateTime time01 = LocalDateTime.of(2025, 4, 11, 11, 40, 11, 333); // 333자리는 나노세컨드 - 10의 -9제곱
		System.out.println("날짜 : " + time01);
		
		// 날짜 변경
		LocalDateTime nextDay = now.plusHours(2);
		System.out.println("변경 날짜 : " + nextDay);
		
		// 시간차이 구하기
		LocalDateTime start = LocalDateTime.of(2025, 4, 11, 10, 0, 0);
		LocalDateTime end = LocalDateTime.of(2025, 4, 11, 13, 0, 0);
		
		Duration duration = Duration.between(start, end);
		System.out.println("시간차이 : " + duration.toHours());
		
		LocalDateTime start2 = LocalDateTime.of(2025, 4, 10, 10, 0, 0);
		LocalDateTime end2 = LocalDateTime.of(2025, 4, 11, 13, 30, 0);
		
		Duration duration2 = Duration.between(start2, end2);
		System.out.println("시간차이 : " + duration2.toDaysPart() + "일" + duration2.toHoursPart() + "시간" + duration2.toMinutesPart() + "분");
	}

}
