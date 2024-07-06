package section07;

public class Ex0701 {

    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] oddArr = { 1, 3, 5, 7, 9 }; // 홀수 배열
        int evenArr[] = { 2, 4, 6, 8, 10 }; // 짝수 배열
        
        // 배열의 주소값 출력
        System.out.println("oddArr\t\t: " + oddArr); // 배열의 주소값 출력 (예: [I@372f7a8d)
        
        // 각 인덱스에 있는 요소 출력
        System.out.println(oddArr[0]); // 인덱스 0의 요소 출력
        System.out.println(oddArr[1]); // 인덱스 1의 요소 출력
        System.out.println(oddArr[2]); // 인덱스 2의 요소 출력
        System.out.println(oddArr[3]); // 인덱스 3의 요소 출력
        System.out.println(oddArr[4]); // 인덱스 4의 요소 출력
        
        // 배열 인덱스 범위를 넘어가는 경우 오류
        // System.out.println(oddArr[5]); // 주석 처리된 부분: 인덱스 5는 존재하지 않으므로 오류 발생
        
        // 배열의 길이 출력
        System.out.println("oddArr.length\t: " + oddArr.length); // 배열의 길이 출력
        
        // 반복문을 사용하여 배열 요소 출력
        for(int i = 0; i < oddArr.length; i++) {
            System.out.printf("%d ", oddArr[i]); // 배열의 요소를 순서대로 출력
        }
    }

}
