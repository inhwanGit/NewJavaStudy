package Day1;

// import : 외부 클래스 포함시키는 키워드
// * import 패키지명.클래스명;
// JDK 안에 여러가지 패키지가 정의되어 있다. Scanner는 그 중에 하나이다.
import java.util.Scanner;

public class Ex03_Scanner {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        System.out.print("a : ");
        int a = scan.nextInt(); // nextInt() : 정수 하나를 입력받는 메소드

        System.out.println("a : " + a);

        // close() : scanner 객체를 메모리에서 해제하는 메소드 -> close 뒤에서는 더 이상 입력을 받을 수 없다.
        scan.close();
    }
}
