package Day2;

import java.util.Scanner;

public class Ex08_Triangle {
    public static void main(String[] args) {
        // 삼각형 넓이 : (밑변) x (높이) / 2
        // 밑변과 높이를 입력받아 삼각형의 넓이를 계산하고 출력하시오.
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.print("삼각형 밑변의 길이를 작성해주세요. : ");
        a = sc.nextFloat();
        System.out.print("삼각형 높이 길이를 작성해주세요. : ");
        b = sc.nextFloat();

        c = (a * b) / 2;

        System.out.println("삼각형의 넓이는 : " + c);

        sc.close();


    }
}
