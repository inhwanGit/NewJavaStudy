package Day9.Exception;

/*
* 예외 처리
* ClassCastException : 클래스 간의 타입 변환시, 올바르지 않은 변환으로 인해 발생하는 예외 상황
* - 업캐스팅이 전제되지 않은 다운캐스팅을 하는 경우
* - 부모/자식의 관계가 아닌 클래스로 캐스팅하는 이유
**/

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class ClassCastException {
    // (부모 클래스)                (자식 클래스)
    // Animal        <---         Dag, Cat
    // Animal = Cat               [업캐스팅]
    // Dog = (Dog) Animal<Cat>    [다운캐스팅](불가)
    // 다시 Animal를 Dog로 다운캐스팅할 수 없다.
    // - Cat을 Dog 타입으로 변환 할 수 없다.

    public static void changeToDog(Animal animal){ // 매개변수로 받는 과정에서 업캐스팅이 진행된다.
        // java.lang.ClassCastException
        // : class Cat cannot be cast to class Dog
        Dog dog = (Dog) animal;       // 다운캐스팅
    }

    public static void main(String[] args) {
        Dog dog = new Dog();              // 가능
        changeToDog(dog);

        Cat cat = new Cat();             // 불가능
        changeToDog(cat);
    }
}
