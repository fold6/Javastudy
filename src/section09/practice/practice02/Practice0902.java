package section09.practice.practice02;
/*
이름: 김일남, 학년: 0, 성적: 0
이름: 김이남, 학년: 3, 성적: 0
이름: 김삼남, 학년: 2, 성적: 85
 */
class Student {
    String name;
    int grade;
    int score;
    Student(String name) {
        this.name = name;
    }
    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    Student(String name, int grade, int score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }
    void printInfo() {
        System.out.printf("이름: %s, 학년: %d, 성적: %d\n", name, grade, score);
    }
}
public class Practice0902 {
    public static void main(String[] args) {
        Student student1 = new Student("김일남");
        Student student2 = new Student("김이남", 3);
        Student student3 = new Student("김삼남", 2, 85);
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }
}