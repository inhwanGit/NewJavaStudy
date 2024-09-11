package Day8.DesignPattern.Builder;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder.Builders().energy(100).type("전기").level(10).build();

        System.out.println(builder);
    }
}
