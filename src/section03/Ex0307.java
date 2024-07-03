package section03;

public class Ex0307 {
    public static void main(String[] args) {
        // 이항 - 논리 연산자 
        // 논리곱(AND):  두 값이 모두 참일 때만 결과가 true
        System.out.println("true && true\t:" + (true && true));
        System.out.println("true && false\t:" + (true && false));
        System.out.println("false && true\t:" + (false && true));
        System.out.println("false && false\t:" + (false && false));
        
        // 논리합(OR) : 하나라도 참이면 결과가 true
        System.out.println("true || true\t:" + (true || true));
        System.out.println("true || false\t:" + (true || false));
        System.out.println("false || false\t:" + (false || false));
        

        // 배타적 논리합(XOR) :왼쪽 오른쪽이 서로 다르면 true
        System.out.println("true ^ true\t:" + (true ^ true));
        System.out.println("false ^ true\t:" + (false ^ true));
        System.out.println("true ^ false\t:" + (true ^ false));
        System.out.println("false ^ false\t:" + (false ^ false));
    }
    
}
