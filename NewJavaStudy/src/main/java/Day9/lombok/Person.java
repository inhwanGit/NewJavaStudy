package Day9.lombok;

// lombok 플러그인 시 꼭 id "io.freefair.lombok" version "5.3.3.3" 데이터 추가해야 한다.


// @ 어노테이션 : 어떠한 기능이나 설명에 대한 내용을 명시해주는 코드
// lombok : 생성자, 매개변수가 있는 생성자 등을 자동으로 생성되게 만들어주는 라이브러리
// @NoArgsConstructor : 기본생성자
// @AllArgsConstructor : 모든 매개변수 생성자
// @RequiredArgsConstructor : final 및 @NonNull 붙인 변수들을 포함하 필수 생성자
// @NonNull : null이 들어오지 못하도록 지정
// @Getter : getter
// @Setter : setter
// @ToString : toString
import lombok.Data;

// @Data : @Getter, @Setter, @ToString, @RequiredArgsConstructor, @EqualsHashCode
@Data
public class Person {
    private String name;
    private int age;
    private double height;
    private int weight;

}
