package Day6.AccessModifier2;

public class Manager {
    public static void main(String[] args) {
        Student student = new Student();
        student.defualtSetting();
        System.out.println("name : " + student.getName());
        System.out.println("age : " + student.getAge());
    }
}
