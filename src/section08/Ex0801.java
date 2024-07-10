package section08;

public class Ex0801 {
    String owner;
    // 메서드 : 클래스 안에 정의된 함수

    // 1. 인수가 X conCalc의 소괄호->(), 반환값도 X
    // void 메서드의 반환값이 없다는 것을 Java에게 알려줌 (계산기 켜는 역할)
    void onCalc() {
        System.out.println("계산기 전원이 켜졌습니다");
    }

    // 2. 인수가 X, 반환값이 O
    double pie() {
        return 3.14;
    }

    // 3. 인수 O, 반환값 O
    int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }

    // 4. 인수 O, 반환값 X
    void offcalc(String name) {
        owner = name;
        System.out.println(owner + "님 안녕히 계세요");
    }

    // main 메서드: 프로그램의 시작점
    public static void main(String[] args) {
        // Ex0801 클래스의 객체를 생성하고 onCalc 메서드를 호출
        Ex0801 cal = new Ex0801();
        cal.onCalc();
        double value = cal.pie();
        System.out.println(5 * 2 * value);
        int value2 = cal.add(1, 2, 3);
        System.out.println(value2);

        cal.offcalc("김일남");  // 수정된 부분
    }
}
