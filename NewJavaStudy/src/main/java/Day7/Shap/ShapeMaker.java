package Day7.Shap;

import java.awt.*;
import java.util.Scanner;

public class ShapeMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 입력 변수
        double width = 0.0;
        double height = 0.0;
        double radius = 0;

        // 입력받은 도형 배열 (2개)
        Shaps[] shapes = new Shaps[3];

        int index = 0;

        while (true) {
            if(index == 2) break;

            System.out.println("1. 삼각형, 2. 사각형, 0. 종료");
            System.out.print(">>");
            String input = scanner.next(); //next() : 문자열 입력

            if(input.equals("0")) {
                break;
            }

            // 도형 선택
            switch (input) {
                //삼각형
                case "1":
                    System.out.print("가로 : ");
                    width = scanner.nextDouble();
                    System.out.print("세로 : ");
                    height = scanner.nextDouble();
                    shapes[index++] = new Triangle(width, height);
                    break;
                case "2":
                    System.out.print("가로 : ");
                    width = scanner.nextDouble();
                    System.out.print("세로 : ");
                    height = scanner.nextDouble();
                    shapes[index++] = new Rectangle(width, height);
                    break;
            } //switch문 끝
        } // while문 끝

        // 넓이 총합, 둘레 총합
        double areaSum = 0.0;
        double roundSum = 0.0;

        for (Shaps shape : shapes) {
            // 넓이와 둘레
            double area = shape.area();
            double round = shape.round();

            // 합계
            areaSum += area;
            roundSum += round;

            // instaceof : 인스턴스를 비교(확인)하는 연산
            // - 같은 인스턴스면 true, 아니면 false를 반환
            if(shape instanceof Triangle) {
                System.out.println("삼각형");
            }
            if(shape instanceof Rectangle) {
                System.out.println("사각형");
            }

            System.out.println("넓이 : " + area + "\t");
            System.out.println("둘레 : " + round + "\t");
        } // foreach 끝
        scanner.close();
    }
}
