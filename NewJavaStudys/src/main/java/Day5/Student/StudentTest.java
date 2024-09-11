package Day5.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "홍길동";
        stu.age = 18;
        stu.studentNumber = "123456";
        stu.major = "컴퓨터공학";
        int scores[] = {100, 80, 90, 50, 75}; // 학생1의 성적

        System.out.println(":::::: 학생1 ::::::");
        System.out.println("학생1 - 이름 : " + stu.name);
        System.out.println("학생1 - 나이 : " + stu.age);
        System.out.println("학생1 - 학번 : " + stu.studentNumber);
        System.out.println("학생1 - 전공 : " + stu.major);
        System.out.println("학생1 - 성적 : " + stu.total(scores));
        stu.study("프로그래밍");
    }
}
