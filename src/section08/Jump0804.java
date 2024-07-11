package section08;

import section10.Overriding.Animal;

public class Jump0804 {
    public static void main(String[] args) {
        // 객체 명앞에는 type이 붙음 animal도 type임
        Animal cat = new Animal();
        Animal dog = new Animal();

        dog.setName("Happy");
        cat.setName("CoCo");

        // Animal.java 의 인스턴스(field)(String name;)는 cat dog 객체 각각이고, 공유되지 않음
        // cat객체의 name을 출력하므로 coco가 출력댐
        System.out.println(dog.name);
        System.out.println(cat.name);
    }

}
