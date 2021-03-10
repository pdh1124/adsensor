package studyparameter01;

abstract class Animal {// 추상클래스
   abstract public void life();// 1개 이상의 추상 메소드.

   abstract public void ghost();
}

class GroundAnimal extends Animal {

   @Override
   public void life() {}
   // 자신의 클래스를 추상 클래스로 처리하기 싫다면 중괄호를 이용하여 {}만 처리해도
   // 컴파일러는 구현했다고 인식함.

   @Override
   public void ghost() {
      System.out.println("영혼의 이끌림을 느낀다.");      
   }
// 추상클래스를 상속 받은 클래스는 부모의 추상메소드를  구현하거나,
   // 구현하지 않는다면, 자기 자신도 추상 클래스가 된다.
   
   public void ground() {
      System.out.println("땅 위를 달린다.");
   }
}

public class Main {
   public static void main(String[] args) {
      Animal a = new GroundAnimal();
      a.ghost();

      // a.ground();

      if (a instanceof GroundAnimal) {
         GroundAnimal ga = (GroundAnimal) a;
         ga.ground();
      }
   }
}