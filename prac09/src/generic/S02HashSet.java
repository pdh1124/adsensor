package generic;

import java.util.HashSet;
import java.util.Iterator;

//- 발전된 배열의 느낌.
//- 크기가 고정되지 않고, 객체를 추가하면 늘어났다가
//- 객체를 제거하면 자동으로 줄어든다.
//- 객체 추가시에는 add()
//- 객체 제거시에는 remove()
//- 저장된 객체 개수는 size()
//- 저장된 객체를 표시할때는 iterator를 이용하여 처리.
//- iterator에 받은 값은 1회성.

class Animal {
	String species;
	String habitat;

	// 생성자 멤버필드를 초기화 ()
	Animal(String species, String habitat) {
		this.species = species;
		this.habitat = habitat;
	}
	
	//객체의 동등 비교시 사용
	public int hashCode() {
		return (species + habitat).hashCode();
		//임의의 접근 주소를 돌려줌.(숫자값)
	}
	
	
	//객체의 동등 비교시 사용
		public boolean equals(Object obj) {

		if (obj instanceof Animal) {
			Animal temp = (Animal) obj;
			return species.equals(temp.species) && habitat.equals(temp.habitat);
		}
		
		else {
			return false;
		}

	}
		
	void showAnimal() {
		System.out.println(species +" "+ habitat);
	}
	

}
 

public class S02HashSet {

	public static void main(String[] args) {

		HashSet<Animal> hs = new HashSet<Animal>();
		
		Animal a = new Animal("고양이", "육지");
		
		hs.add(a); //생성
		hs.add(new Animal("고양이2", "육지2"));
		hs.add(new Animal("고양이3", "육지3"));
		hs.add(new Animal("고양이4", "육지4"));
		hs.add(new Animal("고양이4", "육지4"));
		hs.remove(a); //삭제

		System.out.println(hs.size());
		
		for(Animal str : hs) {
			//System.out.println(str.showAnimal()); 실행불가
			System.out.print(str.species + " ");
			System.out.println(str.habitat);
		}
		
//		Iterator<Animal> itr = hs.iterator();
//		
//		while (itr.hasNext()) {
//			Animal p = itr.next();
//			p.showAnimal();
//		}
		
	}

}