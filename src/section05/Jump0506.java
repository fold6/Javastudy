package section05;

public class Jump0506 {
    public static void main(String[] args) {
        int[] marks = { 90, 25, 67, 45, 80 };

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 60) {
                // marks의 0번인덱스인 i 부터 가져옴
                System.out.println((i + 1) + "번 학생은 합격");
            } else {
                System.out.println((i + 1) + "번 학생은 불합격");
            }
        }
        System.out.println();

        
        //for each 문으로 변경
        int no = 0;
        for(int mark:marks){
            no++;
            if (mark >= 60) {
                // marks의 0번인덱스인 i 부터 가져옴
                System.out.println(no + "번 학생은 합격");
            } else {
                System.out.println(no + "번 학생은 불합격");
            }
        }
    }
}
