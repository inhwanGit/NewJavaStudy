package Day2;

public class Ex04_Int {
    public static void main(String[] args) {
        // int : 정수형 리터럴
        // 정수 리터럴
        // - 10 진수 : 0,1,2,3,4,5,6 ....
        // - 8 진수 : 0?
        // - 16 진수 : 0x?
        //            0,1,2,3,4,5,A,B,C,D .....

        // 10진수
        int var1 = -10;
        System.out.println(var1);

        // 8진수 -> 숫자 앞에 0을 붙이면 됌
        int var2 = 010;
        System.out.println(var2);

        // 16진수 -> 숫자 앞에 0x을 붙이면 됌
        int var3 = 0x10;
        System.out.println(var3);

        // 2진수 -> 2진수 앞에 0b를 붙이면 2진수 처리 가능
        int var4 = 0b1100;
        System.out.println(var4);
    }
}
