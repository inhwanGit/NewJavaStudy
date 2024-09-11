package Day5.Class;

// 상속
// - 키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu{

    // 부모 클래스의 생성자를 따라서 자동완성

    public Raichu() {
    }

    public Raichu(int energy, String type) {
        // super() : 서브 클래스에서 슈퍼 클래스의 생성자를 호출하는 메소드
        // * 주의 : 1. super()는 반드시 생성자 코드에서만 호출할 수 있다.
        //         2. super()는 반드시 같은 클래스 내 다른 생성자를 호출할 때 사용된다.
        //         3. super()는 반드시 생성자의 첫 번째 문장이 되어야 한다.
        super(energy, type);
    }

    // 메소드 오버라이딩 : 부모 클래스이 메소드를 자식 클래스에서 재정의하여, 부모 메소드를 무시하고, 자식 메소드를 우선하여 실행하는 것
    // * 어노테이션 : 코드에 특별한 기능 또는 설명을 추가하는 방법
    //           :  메소드 및 클래스 위에 @어노테이션이름 형태로 사용한다.

    @Override // 부모 클래스의 메소드를 재정의한 메소드임을 명시하는 어노테이션 (생략가능)
    public String aAttack(){
        return "천만볼트";
    }
    @Override
    public String bAttack(){
        return "볼트체인지";
    }
    public String cAttack(){
        return "몸통박치기";
    }
}
