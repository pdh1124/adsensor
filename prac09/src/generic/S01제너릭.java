package generic;

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
