package Day6.AccessModifier2;

import Day6.AccessModifier1.Person;

public class Student extends Person {
    public Student() {}

    public Student(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }

    // 메소드
    public void defualtSetting(){
        name = "이름없음"; // name는 public 접근지정자로, 모든 곳에서 접근 가능
        age = 20;       // age는 protected 접근지정자로, Person 상속받았기 때문에 다른 패키지라도 접근 가능
        // height = 170; // height는 default 접근지정자로, 같은 패키지에서만 접근 가능
        // weight = 60;  // weight는 private 접근지정자로, 해당 클래스에서만 접근가능
        setHeight(170);
        setWeight(60);
    }
}
