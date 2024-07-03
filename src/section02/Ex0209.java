package section02;

public class Ex0209 {
    public static void main(String[] args) {
        double doubleNum = 1.0e100; //1.0 10^100  < float이 표현할수있는 범위를 넘는 값
        float floatNum = (float)doubleNum;//<위 값을 float으로 바꿔서 보여줌
        System.out.println(floatNum);//infinity 

        doubleNum = 1.0e-100; //1.0 10^-100
        floatNum = (float)doubleNum;
        System.out.println(floatNum);
        // 양수로 변환 불가능한 큰 값은 Infinity / 변환 불가능한 작은 값은 0.0
    }

}
