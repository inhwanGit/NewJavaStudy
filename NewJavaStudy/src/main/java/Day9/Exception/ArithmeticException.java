package Day9.Exception;

/*
* 예외처리
* - ArithmeticException(산술 연산 예외) : 어떤 수를 0으로 나누는 경우 등 수학적 정의가 불가한 연산 발생하는 예외
* */

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("a : ");
        a = scanner.nextInt();
        System.out.println("b : ");
        b = scanner.nextInt();

        // 예외 메시지 : java.lang.ArithmeticException:
        // 예외 처리 : try~catch
        try {
            // 예외 발생 가능성이 있는 문장
            System.out.println("a / b = " + (a/b));
        }
        // catch (예외타입 객체){}
        // * Exception : 최상위 예외 클래스
        // - Exception 으로 지정하면 모든 예외 상황에 대해서 처리한다.
        catch (java.lang.ArithmeticException e) {
            // 예외 발생 시, 실행할 예외 처리 문장®
            System.err.println("0으로 나누는 연산은 수학적으로 정의되지 않습니다.");
        }
        // finally 블록 (생략가능)
        finally {
            // 예외 발생과 무관하게 실행하는 문장
            // * 주로 예외 처리와 관련된 문장을 작성 ( 자원 해제 등)
            System.out.println("메모리를 해제합니다.");
            scanner.close();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
