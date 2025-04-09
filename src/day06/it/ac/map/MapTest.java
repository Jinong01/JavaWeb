package day06.it.ac.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 맵은 검색이 엄청 빠르다, key 값이 중복이면 치환해서 나중에 들어온 값으로 저장됨

public class MapTest {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		// 등록 put(key, value)
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		
		// 치환효과 - 키 중복을 이용한 치환
		map.put("four", 44);
		
		// 추출 - get(key)
		System.out.println(map.get("four"));

		// 삭제 - remove(key)
		map.remove("one");
		
		// key 를 얻어서 loop 를 돌릴 수 있다.
		Set<String> keysets = map.keySet();
		System.out.println("================================");
		for( String key : keysets) {
			System.out.println(key + " : " + map.get(key));
		}
	
		// 값이 있는지 비교
		System.out.println(map.containsValue(4));
		// 키가 존재하는지 비교
		System.out.println(map.containsKey("two"));
	}
}
