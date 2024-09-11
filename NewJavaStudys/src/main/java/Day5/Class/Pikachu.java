package Day5.Class;

public class Pikachu {
    // 클래스 : 객체를 정의하는 설계도
    // 멤버 : 변수, 메소드
    // 생성자 : 객체가 생성될 때, 실행되는 메소드
    //        - 객체의 변수를 초기화하는 역할, * 생성자의 이름은 클래스의 이름과 동일해야한다.
    // [생성자 정의] - 접근지정자 생성자명(매개변수) {}
    // [메소드 정의] - 접근지정자 반환타입 메소드명(매개변수){}

    // 변수
    public int energy;
    public String type;

    // 생성자
    // * 기본 생성자는 정의하지 않으면 컴파일러가 자동으로 정의해준다.
    public Pikachu(int energy, String type) {
        this.energy = energy; // this : 현재 객체 자신을 가리키는 레퍼런스(객체의 멤버(변수/메소드)에 접근할 때 사용
                              // * 필요성 : 멤버변수의 이름과 메소드의 매개변수의 이름이 같을 때, 이를 구분해주기 위해 사용, EX) (멤버변수) - this.name, (매개변수) - name
        this.type = type;
    }

    public Pikachu() {
        this(100, "전기"); // 매개변수가 있는 생성자를 호출하여 값을 넣어줄 수 있다. this()는 항상 첫번째 문장에 있어야 한다.
    }

    // 메소드
    public String aAttack(){
       return "백만볼트";
    }

    public String bAttack(){
        return "전광석화";
    }

    // toString() : 반환하는 문자열을 객체의 출력으로 대체해주는 메소드
    @Override
    public String toString() {
        return "Pickachu [energy=" + energy + ", type= "+type +"]";
    }
}
