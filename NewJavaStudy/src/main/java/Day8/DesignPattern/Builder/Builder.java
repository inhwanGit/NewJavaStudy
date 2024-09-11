package Day8.DesignPattern.Builder;

/*
* 빌더 패턴 : 복잡한 객체를 단계적으로 구성할 수 있도록 해주는 디자인 패턴
*
**/
public class Builder {

    // 변수
    int energy;
    String type;
    int level;

    // private 생성자
    private Builder(Builders builders) {
        this.energy = builders.energy;
        this.type = builders.type;
        this.level = builders.level;
    }

    // PikachuBuilder 클래스 정의
    // static 이너 클래스
    public static class Builders {
        private int energy;
        private String type;
        private int level;

        public Builders(){}
        public Builders(int level, String type, int energy) {
            this.level = level;
            this.type = type;
            this.energy = energy;
        }

        // 각각 변수를 지정하고 지정된 객체를 반환하는 메소드ㅡ
        public Builders energy(int energy) {
            this.energy = energy;
            return this;
        }
        public Builders type(String type) {
            this.type = type;
            return this;
        }
        public Builders level(int level) {
            this.level = level;
            return this;
        }

        // 객체를 생성해주는 메소드
        public Builder build() {
            return new Builder(this);
        }
    } // - Builders 클래스 끝

    @Override
    public String toString() {
        return "Builder{" +
                "energy=" + energy +
                ", type='" + type + '\'' +
                ", level=" + level +
                '}';
    }
}
