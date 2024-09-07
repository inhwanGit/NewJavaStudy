package Day4;

// enum(열거타입) 정의
// - 열거타입 enum은 파일로도 정의할 수 있고, 클래스 파일 내부에서 정의할 수 있다.

enum Test {A,B,C,D,E,F}

public class Ex05_Enum {
    public static void main(String[] args) {
        // Enum(열거타입)
        // - 요소들은 명명한 값으로 집합을 이루는 자료형
        // 특징
        // 1. enum을 비교할 때는 값 뿐만아니라 타입도 비교한다.
        // 2. enum의 상수값이 재정의되도 다시 컴파일할 필요가 없다.

        // Enum 관련 메소드
        // - values()         : 열거타입의 모든 요소를 배열로 반환
        // - valueOf()        : 전달된 문자열과 일치하는 열거타입 상수를 반환
        // - ordinal()        : 해당 열거체 상수가 정의된 순서(index)를 반환

        Rainbow[] rainbows = Rainbow.values();

        for(Rainbow color : rainbows){
            System.out.println(color + " ");
        }
        System.out.println();

        Rainbow G = Rainbow.valueOf("PURPLE");
        System.out.println("G : "+ G);

        int index = G.ordinal();
        System.out.println("PURPLE의 index :  " + index);
    }
}
