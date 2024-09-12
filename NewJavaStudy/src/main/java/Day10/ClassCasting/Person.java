package Day10.ClassCasting;

import lombok.Data;

@Data
public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String work(){
        return "일을 합니다.";
    }
}
