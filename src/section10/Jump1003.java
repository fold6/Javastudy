package section10;

public class Jump1003 {
    public static void main(String[] args) {
        HouseDog hd = new HouseDog();
        hd.setName("poppy");
        // hd.sleep(4); // 주석 처리된 코드는 사용하지 않음
        hd.sleep(); // HouseDog의 오버라이딩된 sleep 메소드 호출
    }
}
