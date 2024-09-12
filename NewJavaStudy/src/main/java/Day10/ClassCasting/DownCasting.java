package Day10.ClassCasting;

public class DownCasting {
    public static void main(String[] args) {
        // 다운 캐스팅 (강제 형 변환)
        // * 전제 조건 : 업 캐스팅이 먼저 되어 있어야 한다.
        // - 다운 캐스팅은 업 캐스팅된 부모 객체를 자식 객체로 변환하는 것
        // - 업 캐스팅 : (부모) <- (자식)
        // - 다운 캐스팅 : (자식) <- (부모)

        // 업캐스팅
        Person person = new Student("홍길동", 20, 1, "컴공");
        System.out.println(person);
        System.out.println(person.work());

        // 다운캐스팅
        Student student = (Student) person;

        // Student student = person; // err
        System.out.println(student);
        System.out.println(student.work());

        System.out.println("");
    }
}
