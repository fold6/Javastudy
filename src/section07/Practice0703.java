package section07;


public class Practice0703 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int sum = 0;


        for(int number : numbers){
            sum += number;
        }
        double average= (double)sum / numbers.length;
        System.out.print("배열요소 평균:" + average);
    }
}
