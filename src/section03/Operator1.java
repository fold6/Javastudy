package section03;

public class Operator1 {
    public static void main(String[] args) {
        // [연산자]
        // 1. 단항연산자
        // 1) 부호 연산자 : +1, -1
        System.out.println(+1);
        System.out.println(-1);



        // 2) 증감 연산자 : ++(증가연산자), --(감소연산자)
        /* 이부분 이해안됨 ㅇㅇ */
        /* 이부분 이해안됨 ㅇㅇ */
        System.out.println("----");
        int n1 = 1;
        System.out.println(++n1); // 2
        System.out.println(n1++); // 2
        System.out.println(n1); // 3
        System.out.println(--n1); // 
        System.out.println(n1--); // 
        System.out.println(n1); // 1


        // 3) 논리 부정(뒤집기) 연산자 : !
        System.out.println(true); // true
        System.out.println(!true); // true를 뒤집었으니 false가 나옴
        System.out.println(!(1 == 2)); // 1은 2와 다르므로 false가 나와야 하지만, 뒤집기를 했으니 false가 안옴


        // 2. 이항연산자() - 항이 2개 인 연산자
        System.out.println(1 + 1); // 2
        System.out.println(1 - 1); // 0
        System.out.println(5 * 2); // 10
        System.out.println(5 / 2); // 하면 2가 나옴
        System.out.println(5.0 / 2.0); // 하면 2.5가 나옴 (정수 실수 타입을 가리기 때문에 이렇게 실수로 나누어야 2.5가 나옴)
        System.out.println(5 % 2);// 나머짓값인 1이 나옴
        System.out.println(5 % 2 == 1); // 나머짓 값이 1이 맞기에 true
        System.out.println(5 % 2 == 0); // 나머짓 값이 0이 니까 false (나머지 연산자는 짝인지 홀인지 판별하기 위해 쓴다 
        //짝수 : 어떤수를 2로 나누었을때 나머지가 0인수(2,4,6..)
        //홀수 : 어떤수를 2로 나누었을때 나머지가 1인수(1,3,5..)

        
        // 3. 삼항연산자(ㄷㄷ)
        System.out.println();
    }
}
