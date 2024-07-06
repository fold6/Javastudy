package section05;

public class jump0504 {
    public static void main(String[] args) {
        // 구구단 출력하기
        for (int i = 2; i < 10; i++) { // 2단부터 9단까지 반복하는 바깥쪽 반복문
            System.out.println(i + "단"); // 현재 단(i)을 출력
            for (int j = 1; j < 10; j++) { // 각 단의 곱셈을 계산하는 안쪽 반복문
                System.out.println(i + "×" + j + "=" + (i * j)); // 구구단 곱셈을 출력
            }
            System.out.println(); // 각 단의 출력이 끝나면 한 줄 띄기
        }
    } 
}
