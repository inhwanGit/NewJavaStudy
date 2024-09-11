package Day9.Exception;

import java.util.Scanner;

/*
* 예외처리
* IndexOutOfBound : 배열이나 문자열의 index를 벗어나는 경우 발생하는 예외
**/
public class IndexOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 요수의 개수");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("접근할 index : ");
        int index = sc.nextInt();
        System.out.println("입력할 값 : ");
        int input = sc.nextInt();

        // 예외 메시지 : java.lang.ArrayIndexOutOfBoundsException
        // 예외 상황 : 배열의 index 범위를 초과하여 접근한 경우
        try{
            arr[index] = input;
            System.out.println("arr["+index+"] = " + arr[index]);

        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.err.println("배열 index의 범위를 초과하여 접근하였습니다.");
            System.out.println("(0~"+(N-1)+") 사이의 정수 범위에서 입력해주세요.");
        }
        sc.close();
    }
}
