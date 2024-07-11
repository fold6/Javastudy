package section10;

import section10.Overriding.Dog;

public class HouseDog extends Dog {
/*     HouseDog (String name){
        super(name);
    } */
    
    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }

    // 오버라이딩
    @Override
    void sleep() {
        super.sleep();
        System.out.println(this.name + " in house");
    }

    public static void main(String[] args) {
        HouseDog hd = new HouseDog();
        hd.setName("poppy");
        hd.sleep(); // HouseDog의 오버라이딩된 sleep 메소드 호출
        hd.sleep(4); // HouseDog의 sleep(int hour) 메소드 호출
    }
}
