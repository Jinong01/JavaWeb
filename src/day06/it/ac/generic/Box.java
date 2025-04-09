package day06.it.ac.generic;

public class Box<T> {
	
	private Object[] data;
	private int size;
	
	public Box () {
		this.data = new Object[10];
	}
	
	public void add(T o) {
		if(this.size == this.data.length) {
			// 배열을 복사해서 늘린다.
			Object[] newArr = new Object[size*2];
			System.arraycopy(this.data, 0, newArr, 0, this.data.length); // 복사할 대상, 시작점, 새로운 배열, 시작점, 복사할 길이
			// 얕은 복사 > 두 객체의 주소값이 같아짐 > 두 개의 객체가 하나의 공간을 가진다.
			this.data = newArr;
		}
		this.data[size++] = o;
	}
	
	public void remove(int index) {
		if(index > this.size) {
			return; // early return pattern 메서드가 리턴타입이 없을 때만 사용 가능
		}
		this.data[index] = 0;
		this.size--;
	}
	
	public T get(int index) {
		return (T)this.data[index];
	}
	
	public int size() {
		return this.size;
	}
}


/*
	제너릭
	<타입>
	
	Box<Apple> box = new Box<>();
	Box<Banana> box = new Box<>();
	
	Box
	타입		의미
	T		타입
	E		얼리먼트
	O		오브젝트
	K		key
	V		value
	---------------------------- 타입은 기능적 의미는 없다.
 */