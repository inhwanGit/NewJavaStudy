package Day2;

public class Ex03_Byte {
    public static void main(String[] args) {
        // byte는 1byte 범위에서 정수 데이터를 표현
        // 8bits (0000 0000) : 2^8 : 256개
        // 양수와 음수로 나누면, -128~0~127 범위로 표현

        byte var1 = -128;
        byte var2 = -30;
        byte var3 = -0;
        byte var4 = 30;
        // 에러
        // -> 에러 메시지 : Type mismatch
        // -> 자료형(타입)이 불일치, 데이터 범위로 벗어남(overflow)
        // byte var5 = 128;
        // byte var5 = (byte) 128;
        // 실행 시킬 경우 overflow가 발생하여 -128 출력 (만보기 생각)


    }
}
