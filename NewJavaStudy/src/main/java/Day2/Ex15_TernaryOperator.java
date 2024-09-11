package Day2;

public class Ex15_TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 5;

        // a와 b의 두 수의 차이(절대값)을 구하시오.
        // a - b = -2
        // b - a = 2
        // * 조건 연산자
        // (조건) ? (참일때 값) : (거짓일 때 값);
        int result = (a > b) ? a - b: b - a;
    }
}
