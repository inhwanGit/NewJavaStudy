package Day3;

import java.util.Scanner;

public class Ex02_ElseIf {
    public static void main(String[] args) {
        // 성적을 입력 받아, 성적에 따른 학점 A~F를 출력하시오.
        Scanner input = new Scanner(System.in);
        int Kor, Eng, Math;
        System.out.print("국어 성적을 입력하세요 : ");
        Kor = input.nextInt();
        System.out.print("영어 성적을 입력하세요 : ");
        Eng = input.nextInt();
        System.out.print("수학 성적을 입력하세요 : ");
        Math = input.nextInt();

        float avg = (float) (Kor+Eng+Math)/3;
        if(avg >= 90){
            System.out.println("A");
        }else if(avg >= 80){
            System.out.println("B");
        }else if(avg >= 70){
            System.out.println("C");
        }else if(avg >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

    }
}
