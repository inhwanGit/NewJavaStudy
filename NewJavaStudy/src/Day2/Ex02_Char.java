package Day2;

public class Ex02_Char {
    public static void main(String[] args) {
        // 문자 자료형 : char
        // 리터럴(Literal) : 소스코드에서 표기하는 데이터(숫자인지, 문자인지, 문자열인지 의미를 부여)
        // - 문자 리터럴 : '' (작은 따옴표로 구분)
        // - 문자열 리터럴 : "" (큰 따옴표로 구분)
        // - 정수 리터럴 : 100 (숫자)
        // - 실수 리터럴 : 12.34f, 12.3456D

        char c1 = 'A';             // 문자 리터럴
        char c2 = 65;              // 십진수 --> 아스키코드표 매핑된 문자
        char c3 = '\u0041';        // 유니코드

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // 에러
        // * 자바에서 정수는 기본적으로 (int)형으로 취급한다.
        // * 연산은 기본적으로 같은 자료형끼리 가능하다.
        // char B = c2 + 1;
        // 위와 같이 하고 싶다면
        char B = (char) (c2 + 1);
        // * 작은 자료형과 큰 자료형을 연산하면, 그 결과는 큰 자료형이 된다.
        // (c2 + 1)      : (char)+(int) = (int) 자동 형 변환
        // B = (char) (c2 + 1) : (char) = (char) (int) 강제 형 변환
        System.out.println(B);
    }
}
