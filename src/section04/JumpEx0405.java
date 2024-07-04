package section04;
// 이걸 int (String)에 이름 입력하고 누구생일인지 같은거 가능할듯
public class JumpEx0405 {
    public static void main(String[] args) {
        int month = 7;
        String monthString = "";

        switch (month) {
            // ! 선택한 숫자의 case만 실행되는게 아닌, 아래 있는 모든 코드가 실행되므로 'break' 를 검
            // switch (문자) 처럼 문자로 입력해도 case별로 실행 가능
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            default:
                monthString = "Invalid month";
        }

        System.out.println(monthString);
    }
}
