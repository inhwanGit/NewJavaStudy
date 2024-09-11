package Day8.AnonymousObject;

public class AnonymousPerson {

    // 익명 자식 객체 생성
    // - 부모클래스 객체명 = new 부모클래스() {익명객체 정의}
    Person person1 = new Person(){
        // Override는 상속에 관계가 성립이 될때 사용가능
        @Override
        void work() {
            System.out.println(name  + "(" + age +")");
            System.out.println("프로그래밍을 합니다.");
            System.out.println();
        }
    };

    void method(){
        person1.name = "홍길동";
        person1.age = 20;
        person1.work();
    }
}
