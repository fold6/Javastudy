package section05;

public class Jump0510 {
    public static void main(String[] args) {
        // 60점 이상인학생을 축하하는 코드
        int[] marks = { 55, 60, 80 };
        int number = 0;

        for (int mark : marks) {
            number++;
            if (mark < 59) {
                continue;
            }
        }
        System.out.println(number + "번 학생 ㅊㅋㅊㅋ");
    }
}
