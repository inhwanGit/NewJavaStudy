package Day4;

public class Ex01_Array {
    public static void main(String[] args) {
        // 배열 선언
        // - 자료형 변수명 [];
        int arr[];

        // 배열 생성
        // - 변수명 = new 자료형 [개수];
        arr = new int[5];

        // 배열 요소에 접근 (배열은 0부터 시작)
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // 배열의 길이 : 배열 요소의 개수 = 배열명.length
        System.out.println(arr.length);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
