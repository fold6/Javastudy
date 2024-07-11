package section10.Overriding;

class Animal{

}

class Dog extends Animal{

}

public class Jump1004 {
    public static void main(String[] args) {
      Dog d = new Dog();

      //instanceof 연산자
      //객체 instanceof 타입(참조)
      System.out.println("d instance of Dog" + (d instanceof Dog));
      System.out.println("d instance of Animal" + (d instanceof Animal));
      //d는 dog의 인스턴스이다
    }
}
