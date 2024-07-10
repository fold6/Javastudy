package section08;

public class Ex0803 {
    // sumFromOneToTen 메서드 정의: 1부터 10까지의 합을 반환
    int sumFromOneToTen() {
        int sum = 0;
        int number = 1;
        while (true) {
            sum += number;
            number++;
            if (number > 10) {
                return sum;
                // return을 써서 반복을 종료 시키기도 함
            }
        }
    }

    public static void main(String[] args) {
        Ex0803 sum = new Ex0803();
        int result = sum.sumFromOneToTen();
        System.out.println(result);
    }
}
