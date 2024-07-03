package section03;

public class Eme4_test{
    
    public static final double PI = 3.1423232424343;

    public static void main(String[] args) {
        //pi를 상수 (constant)로 변경하시오
        // final double PI = 3.1423232424343;
        double radius = 5.0;

        double circumference = 2 * radius * PI;

        System.out.println("원의 둘레:" + circumference);
    
    }
}
