package Day9.Exception;

/*
* 예외 처리
* NumberFormatException : 문자열 숫자("10")가 아닌 문자열을 숫자타입으로 변환 시 발생하는 예외 상황
* ex) "10A" --> 숫자로 변환하면 예외
**/
public class NumberFormatException {
    public static void main(String[] args) {
        String strNum = "10A";
        int num = 10;

        System.out.println("10 + 20 = " + (strNum + 20));
        System.out.println("10 + 20 = " + (num + 20));

        // 예외 메세지 : java.lang.NumberFormatException : For input String: "10A"
        // 예외 상황 : 문자열 숫자가 아닌 문자열을 숫자로 변환할 수 없기 때문에 예외 발생
        try {
            int num1 = Integer.parseInt(strNum); // Integer.parseInt("문자열숫자") : 문자열 숫자를 int 타입의 숫자로 변환하는 메소드
        }catch (java.lang.NumberFormatException e) {
            System.err.println("문자열을 숫자로 변환할 수 없습니다.");
        }
    }
}
