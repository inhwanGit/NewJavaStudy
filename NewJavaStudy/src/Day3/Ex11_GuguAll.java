package Day3;

public class Ex11_GuguAll {
    public static void main(String[] args) {
        // 중첩 반복문(이중 반복문)
        for (int a = 1; a <= 9; a++){
            for(int b = 1; b <= 9; b++){
                System.out.println(a + "X" + b + "=" + a*b);
            }
        }
    }
}
