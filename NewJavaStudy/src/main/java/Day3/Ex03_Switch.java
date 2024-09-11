package Day3;

import java.util.Scanner;

public class Ex03_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("채널을 입력해주세요 : ");
        int Channel = input.nextInt();
        switch (Channel) {
            case 11:
                System.out.print("MBC");
                break;
            case 7:
                System.out.print("KBS");
            default:
                break;
        }
    }
}
