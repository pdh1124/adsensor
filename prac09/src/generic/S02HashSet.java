package generic;

import java.util.HashSet;

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

}

public class S02HashSet {

	public static void main(String[] args) {

		HashSet<Animal> hs = new HashSet<Animal>();
		
		Animal a = new Animal("고양이", "육지");
		
		hs.add(a);
		hs.add(new Animal("고양이2", "육지3"));
		hs.add(new Animal("고양이3", "육지2"));
		hs.remove(a); //삭제

		System.out.println(hs.size());

	}

}