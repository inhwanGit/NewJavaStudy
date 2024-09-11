package Day2;

public class Ex05_Long {
    public static void main(String[] args) {
        // int (4bytes : 32bits) : 2^32개 약 42억 개
        // int 수 표현 범위 : -21억...~21억....

        // long (8bytes : 64bits) : 2^64 개
        long ln1 = 1000;
        long ln2 = 2100000000;

        // long ln3 = 2200000000; 에러가 나는 이유는 기본적인 정수는 Int타입으로 인식하기 떄문
        // 해결방법 정수뒤에 l 붙여주기
        long ln3 = 2200000000l;

        System.out.println(ln1);
        System.out.println(ln2);
        System.out.println(ln3);
    }
}
