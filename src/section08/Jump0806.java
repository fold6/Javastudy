package section08;

public class Jump0806 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.setName("갤럭시");
        c2.setName("아이폰");

        c1.setCount();
        c2.setCount();
        Counter.setCount();
        // Counter.java 가서 보면 setCount 을 ++ 으로 1씩 증가시켜서 아래가 그렇게 적용됨
        
        System.out.println(c1.displayName + " = "+ Counter.count);
        System.out.println(c2.displayName + " = "+ Counter.count);
        
    }
}
