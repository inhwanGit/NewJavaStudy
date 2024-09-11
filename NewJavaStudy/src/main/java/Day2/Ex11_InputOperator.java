package Day2;

import java.util.Scanner;

public class Ex11_InputOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("X : ");
        int x = sc.nextInt();

        System.out.print("Y : ");
        int y = sc.nextInt();

        System.out.print("Z : ");
        int z = sc.nextInt();

        // 합계, 평균
        int sum = x + y + z;
        double avg = sum / 3;
        // (double) = (int) / (int)
        // * int는 정수 자료형으로, 연산을 하면 결과도 int 자료형이 된다.
        // * int 정수 자료형으로는 실수의 소수부분을 표현할 수 없다.

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        sc.close();
    }
}
