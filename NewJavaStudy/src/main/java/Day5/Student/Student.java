package Day5.Student;

public class Student {
    // 학생의 속성 : 이름, 나이, 학번, 전공
    // 학생의 행동 : 공부하기, 성적 평균 구하기

    // 변수
    String name;
    int age;
    String studentNumber;
    String major;
    // 생성자
    public Student(){
        this("이름없음", 1, "000000", "없음");
    }
    public Student(String name, int age, String studentNumber, String major) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
        this.major = major;
    }

    // 메소드
    // * 접근지정자 반환타입 메소드명(매개변수){}
    // - 공부하기
    public void study(String subject){
        System.out.println(subject + "(을/를) 공부합니다.");
    }

    // - 성적 평균 구하기
    public float avg(int score1, int score2){
        float average = (float) (score1 + score2)/2;
        return average;
    }

    // - 성적 합계 및 평균 구하기
    public float total(int[] scores){
        float average = 0.0f;
        int sum = 0;
        // 합계
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        // 평균
        return average = (float) sum / scores.length;
    }
}
