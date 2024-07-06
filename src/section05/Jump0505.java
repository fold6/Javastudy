package section05;

public class Jump0505 {
    public static void main(String[] args) {
        // 문자열 배열 선언 및 초기화
        String[] numbers = {"one", "two", "three"};
        
        // 각 인덱스의 요소를 개별적으로 출력
        // System.out.println(numbers[0]); // 인덱스 0의 요소 출력 (one)
        // System.out.println(numbers[1]); // 인덱스 1의 요소 출력 (two)
        // System.out.println(numbers[2]); // 인덱스 2의 요소 출력 (three)

        // for문을 사용하여 배열의 모든 요소를 순서대로 출력
        for(int i = 0; i < numbers.length; i++) { // i가 0부터 배열의 길이 미만까지 증가하면서 반복
            // 즉, 0,1,2
            
            System.out.println(numbers[i]); // 배열의 i번째 요소를 출력
            //라서 위의 3개, ln으로 줄바꿔서 출력
        }

        // 빈 줄을 출력하여 구분
        System.out.println();
        
        // 향상된 for문 (for-each)을 사용하여 배열의 모든 요소를 순서대로 출력
        //for each는 반복가능한 객체(iterable object)에서 사용가능
        for(String number : numbers) { // 배열 numbers의 각 요소를 number 변수에 대입하며 반복
            System.out.println(number); // 배열의 현재 요소를 출력
        }
    }
}