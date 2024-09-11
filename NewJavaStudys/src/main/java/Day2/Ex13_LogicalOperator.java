package Day2;

public class Ex13_LogicalOperator {
    public static void main(String[] args) {
        // 논리연산자
        // - && (AND) : A, B 둘 다 ture, 결과가 true
        // - || (or)  : A, B 둘 중 하나가 true 이면 결과가 true

        // AND
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // OR
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // NOT
        // !A : A가 true 이면 false, false 이면 true로 변환
        System.out.println(!true);
        System.out.println(!false);

        // 쇼트서킷 : 논리 연산에서 결과를 미리 알아서, 남은 논리식을 확인하지 않는 것
        // 비트 연산자의 경우, 쇼트 서킷이 적용되지 않는다.
    }
}
