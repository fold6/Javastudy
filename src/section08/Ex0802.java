package section08;

public class Ex0802 {
    // sumFromOneToTen 메서드 정의: 1부터 10까지의 합을 반환
    int sumFromOneToTen() {
        int sum = 0;
        int number = 1;
        while (true) {
            sum += number;
            number++;
            if (number > 10) {
                break;
            }
        }
        // 1~10까지 더해서 반환
        return sum;
    }

    public static void main(String[] args) {
        Ex0802 sum = new Ex0802();
        int result = sum.sumFromOneToTen();
        System.out.println(result);
    }
}
