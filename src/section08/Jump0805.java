package section08;

public class Jump0805 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println("c1.count:" + c1.count);
        System.out.println("c2.count:" + c2.count);
        System.out.println("Counter.count:" + Counter.count);

        System.out.println("---");
        c1.setCount();
        c2.setCount();
        
        Counter.setCount();
        // Counter.java 가서 보면 setCount 을 ++ 으로 1씩 증가시켜서 아래가 그렇게 적용됨
        
        System.out.println("c1.count:" + c1.count);
        System.out.println("c2.count:" + c2.count);
        System.out.println("Counter.count:" + Counter.count);

        
    }
}
