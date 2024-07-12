package section10.casting;
class Animal {
}
class Dog extends Animal {
    
}
class Cat extends Animal {
}

public class Ex1005 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        // Dog dogAnimal = (Dog) animal; // ClassCastException
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
        Animal animalDog = new Dog(); // 자동 형변환
        Dog dogAnimalDog = (Dog) animalDog; // 강제 형변환
        System.out.println("animalDog instanceof Dog: " + (animalDog instanceof Dog));
        Animal animalCat = new Cat(); // 자동 형변환
        // Dog dogAnimalCat = (Dog) animalCat; // ClassCastException, 직접적 상속관계가 아니면 형변환 불가
        System.out.println("animalCat instanceof Dog: " + (animalCat instanceof Dog));
        // IS-A 관계 : 형변환 가능
    }
}