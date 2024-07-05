package section05;
public class Ex0504_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i<=10; i++) {
            //짝수만 더해보자
            if( i % 2 != 0){
                System.out.println(i);
                continue;
                //여기서 현재 실행문 종료의 의미
            }
            sum += i;

            }
            System.out.println(sum);
    }
}
