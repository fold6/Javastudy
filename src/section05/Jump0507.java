package section05;

public class Jump0507 {
    public static void main(String[] args) {
        int[] marks = { 90, 25, 67, 45, 80 };

        for (int i = 0; i < marks.length; i++){
            if(marks[i] < 60){
                continue;
            }
            System.out.println((i+1) + "번 학생 축하합니다. 합격입니다" );
        }
        System.out.println();

        //for each 문으로 변경
        int no = 0;
        for(int mark:marks){
            no++;
            if(mark < 60){
                continue;
                /* 60보다 작으면 처음으로 보내서 다시 검사하게함 (재낌) 60넘는 사람만 보이게함 */
            }
            System.out.println(no + "번 학생 축하합니다. 합격입니다" );
        }


    }
}
