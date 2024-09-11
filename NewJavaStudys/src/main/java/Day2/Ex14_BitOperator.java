package Day2;

public class Ex14_BitOperator {
    public static void main(String[] args) {
        // AND
        int result = 20 & 16;
        // Interger.toBinaryString() : 십진수를 이진수 문자열로 변환하는 메소드
        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.toBinaryString(16));
        System.out.println("-----------------------------");
        System.out.println(Integer.toBinaryString(result));

        //OR
        int result2 = 10 | 16;
        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.toBinaryString(16));
        System.out.println("-----------------------------");
        System.out.println(Integer.toBinaryString(result));

        // XOR
        // : 서로 값이 다르면 1, 같으면 0
        int result3 = 10 ^ 16;
        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.toBinaryString(16));
        System.out.println("-----------------------------");
        System.out.println(Integer.toBinaryString(result3));

    }
}
