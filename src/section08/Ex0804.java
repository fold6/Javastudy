package section08;
    //static을 사용하면 정적 멤버를 만들 수있음
    // 한국 은 공통 반복요소니까 static을 사용하여 정적멤버로써 추가함
   // 같은 패키지 (section08)안에 있으니까 person에서 가져와서 잘 보임

public class Ex0804 {
    public static void main(String[] args) {
        Person.staticCountry = "한국";
        Person kim1 = new Person();
        Person kim2 = new Person();
        Person kim3 = new Person();

        kim1.name = "김일남";
        // kim1.country = "한국";
        kim1.age = 99;

        kim2.name = "김이남";
        kim2.age = 98;
        // kim2.country = "한국";
        kim3.name = "김삼남";
        kim3.age = 97;
        
        // 위 사람들의 객체를 생성해서 아래로 출력해봄 @해시코드 로나타남
        System.out.printf("%s %d세(%s)\n", kim1.name, kim1.age ,  Person.staticCountry);
        System.out.printf("%s %d세(%s)\n", kim2.name, kim2.age,  Person.staticCountry);
        System.out.printf("%s %d세(%s)\n", kim3.name, kim3.age,  Person.staticCountry);
    }
}
