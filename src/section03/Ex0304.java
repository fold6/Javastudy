package section03;

public class Ex0304 {
    public static void main(String[] args) {
        // 논리 부정 연산자
        int age = 20;
        boolean isAdult = age >= 19;

        System.out.println("isAdult\t\t\t : " + isAdult);
        System.out.println("!isAdult\t\t : " + !isAdult);
        System.out.println("!(isAdult = !isAdult)\t: " + !(isAdult = !isAdult));
        //반복해서 뒤집기 가능

    }
    
}
