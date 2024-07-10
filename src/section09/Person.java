package section09;
public class Person {
    String name;
    int age;
    String address;
    // constructor
    Person() {
        name = "아무개";
        age = 0;
        address = "비공개";
    }
    Person(String name) {
        this.name = name;
        age = 0;
        address = "비공개";
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        address = "비공개";
    }
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printInfo() {
        System.out.printf("%s %d세(%s)\n", name, age, address);
    }
}