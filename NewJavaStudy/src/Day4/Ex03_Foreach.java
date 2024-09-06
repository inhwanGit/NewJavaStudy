package Day4;

public class Ex03_Foreach {
    public static void main(String[] args) {
        //  배열 선언 및 초기화
        String[] week = {"월","화","수","목","금","토","일"};

        // - for (자료형 반복요소명 : 배열) {}
        // 배열 또는 컬렉션의 모든 요소를 순서대로 전부 반복하는 반복문
        for(String day : week){
            System.out.println(day + " ");
        }

        // 기본 for문
        for(int i = 0; i<week.length; i++){
            System.out.println(week[i] + " ");
        }
    }
}
