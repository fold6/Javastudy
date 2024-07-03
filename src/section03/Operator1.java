package section03;

public class Operator1 {
    public static void main(String[] args) {
        // [연산자]
        // 1. 단항연산자
        // 1) 부호 연산자 : +1, -1
        System.out.println(+1);
        System.out.println(-1);



        // 2) 증감 연산자 : ++(증가연산자), --(감소연산자)
        System.out.println("----------check----------");
        int n1 = 1;
        // ++n1: 전위 증가 연산자. n1을 먼저 1 증가시킨 후 출력함.
        System.out.println(++n1 + "전위 증가 결과"); // 2 (n1이 1에서 2로 증가한 후 출력됨)

        // n1++: 후위 증가 연산자. n1을 먼저 출력한 후 1 증가시킴
        //(아직 3인걸 출력안해봤으니까, 2 그대로인 상태(말 그대로 후에 1증가 시킴))
        System.out.println(n1++ + "후위 증가 결과"); // 2 
        
        // 현재 n1의 값인 2를 출력한 후, n1이 3으로 증가됨)
        // 현재 n1의 값은 3
        System.out.println(n1); // 3

        // --n1: 전위 감소 연산자. n1을 먼저 1 감소시킨 후 출력함.
        System.out.println(--n1); // 2 (n1이 3에서 2로 감소한 후 출력됨)
        // n1--: 후위 감소 연산자. n1을 먼저 출력한 후 1 감소시킴.
        System.out.println(n1--); // 2 (현재 n1의 값인 2를 출력한 후, n1이 1로 감소됨)
        // 현재 n1의 값은 1.
        System.out.println(n1); // 1



        System.out.println("----------good----------");
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
        System.out.println(5 % 2); // 나머짓값인 1이 나옴
        System.out.println(5 % 2 == 1); // 나머짓 값이 1이 맞기에 true
        System.out.println(5 % 2 == 0); // 나머짓 값이 0이 니까 false (나머지 연산자는 짝인지 홀인지 판별하기 위해 쓴다 
        //짝수 : 어떤수를 2로 나누었을때 나머지가 0인수(2,4,6..)
        //홀수 : 어떤수를 2로 나누었을때 나머지가 1인수(1,3,5..)

        // 3. 삼항연산자()
        System.out.println();
    }
}
