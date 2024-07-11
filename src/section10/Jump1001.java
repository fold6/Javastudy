package section10;

import section10.Overriding.Dog;

public class Jump1001 {
    public static void main(String[] args) {
/*         Animal a = new Animal();
        a.setName("비밀");
        System.out.println(a.name); */

        Dog d = new Dog();
        d.setName("happy");
        // System.out.println(d.name);
        d.sleep();
    }
}
