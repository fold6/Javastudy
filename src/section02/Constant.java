package section02;

public class Constant {
    //main + tab키 메서드 자동완성 단축키
    public static void main(String[] args) {
        final double CONSTANT_PI = 3.14;  
        // final  을 붙히면 'a'는 바꿀 수 없는값(상수)이 됨 , 관례적으로 대문자를 사용함, 단어가 두개이상이면 _ 를 붙힘 (스네이크 케이스를 사용 : 언더바로 단어와 단어를 연결)
        
        //a = 4.14;
        System.out.println(CONSTANT_PI);
    }
}
