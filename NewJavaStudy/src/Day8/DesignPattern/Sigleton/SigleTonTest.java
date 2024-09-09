package Day8.DesignPattern.Sigleton;

public class SigleTonTest {
    public static void main(String[] args) {
       // SigleTon singleTon = new SigleTon(); //err

        SigleTon s01 = SigleTon.getInstance();
        SigleTon s02 = SigleTon.getInstance();

        // 인스턴스가 메모리 공간에 하나로 할당되어 있는지 확인
        System.out.println(s01 == s02);
    }
}
