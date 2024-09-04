package Day2;

public class Ex12_PlusMinusOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;

        //증감연산자
        // ++a, a++            : a를 1증가
        // --a, a--            : a를 1감소

        //전위 연산자             : 연산자 우선순위가 가장 높다
        c = ++a + b;
        System.out.println("C = " + c);
        System.out.println("A = " + a);

        int x = 10;
        int y = 20;
        int z;

        //후위 연산자             : 연산자 우선순위가 가장 낮다
        z = x-- + y;
        System.out.println("Z = " + z);
        System.out.println("X = " + x);
    }
}
