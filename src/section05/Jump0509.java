package section05;

public class Jump0509 {
    public static void main(String[] args) {
        //0506을 for each로 refactoring
        int [] marks = {90, 25, 67, 45, 80};

        int number = 0;
        for (int mark : marks){
            // for (int mark : marks) 의 이해:
            // 이걸 'for-each loop'라고 함. ->  marks' 의 첫번째 요소 '90'을 mark에 할당-> for 블록 내의 코드를 실행 -> '80'까지 반복
            number++;
            if (mark >= 60){
                System.out.println(number + "번 학생은 합격입니다.");
            }else{
                System.out.println(number + "번 학생은 불합격입니다.");
            }
        }
        
    }
    
}
