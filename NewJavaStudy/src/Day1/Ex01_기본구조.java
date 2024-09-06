package Day1;

// 클래스
// public class 클래스명
// * 클래스명 = 파일명 (이름이 같아야한다.)
// * class 영역 바깥에는 코드를 작성할 수 없다.
public class Ex01_기본구조 {
    // * 하나의 실행문은 ;(세미클론)으로 끝나야한다.
    // 변수
    // 자료형 변수명;
    // 자료형 변수명 = 값;

    // ; 으로 구변하여 여러 실행문을 한 줄에 작성가능
    int age = 20; int level = 99;

    // 값을 초기화하지 않고 선언 가능
    // int 자료형은 값을 초기화하지 않았을 때, 기본값 0으로 초기화
    int energy;

    // 메소드
    // * 접근지정자 (static) 반환타입 메소드 (매개변수) {실행문;}
    public int sum(int x, int y){
        int result = x + y;
        // * return
        // 1. 메소드 종료
        // 2. (값)을 메소드를 호출한 자리로 반환
        return result;
    }

    // main 메소드 : 프로그램의 시작점
    // * main 메소드는 하나의 프로그램의 하나의 메소드가 구성된다.
    public static void main(String[] args) {
        // 객체 생성
        // * 클래스타입 객체명 = new 클래스명();
        Ex01_기본구조 객체1 = new Ex01_기본구조();
        // * 객체를 생성해야만, 내부의 변수와 메소드를 접근(사용)할 수 있다.
        // * (.) 접근 연산자로 객체의 변수와 메소드를 접근 및 호출할 수 있다.
        // * 객체.변수
        // * 객체.메소드()
        System.out.println("나이 : " + 객체1.age);
        System.out.println("레벨 : " + 객체1.level);
        System.out.println("에네지 : " + 객체1.energy);

        // 메소드 호출(실행)
        // * 메소드명(인수 1, 인수 2);
        // - 인수(인자, argument) : 메소드로 전달해줄 값
        System.out.println(객체1.sum(10,20));

    }

}
