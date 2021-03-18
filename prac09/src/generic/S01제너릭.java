package generic;

//형변환시 발생될 수 있는 혼란을 방지.
//- 클래스 설계시에는 치환 문자를 사용하고,
//- 실제 사용시 어떤 객체 타입을 사용할지 지정.
//- <> 다이아몬드 꺽쇠를 이용해서 표기

class MyArray<T> {
	// T 자료형. 정해지지 않은 자료형.
	T element;

	void setElement(T element) {
		this.element = element;
	}

	T getElement() {
		return element;
	}

}

public class S01제너릭 {

	public static void main(String[] args) {

		MyArray<String> tmp = new MyArray<>();
		MyArray<Integer> tmp2 = new MyArray<>();
	}

}
