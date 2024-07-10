package section09;
// 사람정보에 대한 내용을 Person에서 가져와서 쓸 수 있음
public class Ex0901 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.printInfo();

        Person person2 = new Person("김일남",99);
        person2.printInfo();
    }
    
}
