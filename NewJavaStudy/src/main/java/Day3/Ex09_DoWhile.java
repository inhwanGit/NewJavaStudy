package Day3;

import java.util.Scanner;

public class Ex09_DoWhile {
    public static void main(String[] args) {
        // 메뉴판
        // * 변수 선언 : 메뉴 번호, 메뉴 이름
        int menuNo = 0;
        String menuName = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("::::::::::메뉴판::::::::::");
            System.out.println("1. 참지마요 삼각김밥");
            System.out.println("2. 도시락");
            System.out.println("3. 라면");
            System.out.println("0. 종료");
            menuNo = sc.nextInt();

            switch (menuNo) {
                case 1: menuName = "참지마요 삼각김밥"; break;
                case 2: menuName = "도시락"; break;
                case 3: menuName = "라면"; break;
                default: break;
            }
            System.out.println(menuNo + "을/를 주문하였습니다.");
        }while (menuNo != 0);
        sc.close();
    }
}
