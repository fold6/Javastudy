// 파일명: Ex1001.java

package section10.ifvsoverriding;

public class Ex1001 {
    static class Animal {
        void cry() {
        }
    }

    static class Pig extends Animal {
        void cry() {
            System.out.println("꿀꿀");
        }
    }

    static class Cow extends Animal {
        void cry() {
            System.out.println("음머");
        }
    }

    static class Tiger extends Animal {
        void cry() {
            System.out.println("야옹");
        }
    }

    static class Lion extends Animal {
        void cry() {
            System.out.println("어흥");
        }
    }

    static class Duck extends Animal {
        void cry() {
            System.out.println("꽥꽥");
        }
    }

    static class Farm extends Animal {
        void sound(Animal animal) {
           /*  if (animal instanceof Pig) {
                System.out.println("꿀");
            }
            if (animal instanceof Cow) {
                System.out.println("음머");
            }
            if (animal instanceof Tiger) {
                System.out.println("야옹");
            }
            if (animal instanceof Lion) {
                System.out.println("어흥");
            } */

            animal.cry();

        }
    }

    public static void main(String[] args) {
        Farm f = new Farm();
        Pig p = new Pig();
        Cow c = new Cow();
        Tiger t = new Tiger();
        Lion l = new Lion();
        Duck d = new Duck();

        f.sound(p); // Pig의 소리 출력
        f.sound(c); // Cow의 소리 출력
        f.sound(t); // Tiger의 소리 출력
        f.sound(l); // Lion의 소리 출력
        f.sound(d); // Duck의 소리 출력
    }
}
