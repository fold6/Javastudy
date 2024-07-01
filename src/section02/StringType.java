package section02;

public class StringType {
    public static void main(String[] args) {
        String a = "Java"; 
        String b = "Java";
        System.out.println(a);
        System.out.println("---");
        System.out.println(b);
        System.out.println(a == b); // 왼 오가 같다는 등호, 같으니까 t나옴

        String c = new String("Java");
        //a와 b는 동일한 문자열 리터럴을 참조하지만, c는 new String("Java")를 사용하여 힙 메모리에 새로 생성된 객체를 참조
        
        System.out.println(c);
        System.out.println(a == c); // false
        //스트링 안의 인수로 자바를 지정가능

        // 안의 값만을 비교하려고 한다면? equals 메서드를 사용
        System.out.println(a.equals(c)); // true, 문자열 내용이 같음
    }
}
