package ch01_variable_operator;

public class printMe {
    public static void main(String[] args) {
        String name ;
        int age ;
        double height ;
        double weight ;
        String blood ;
        char munja ='d';
        boolean bool ;

        name = "안병진"; //문자열은 반드시 쌍따음표
        age = 28 ;
        height = 180.2 ;
        weight = 61.5 ;
        blood = "A"; // 문자열로 입력 했기 때문에 쌍따음표
        // 문자 하나는 외따음표
        bool = false ;

       String message = "이름 : "+ name ;
        System.out.println(message);
        System.out.println("나이 : "+ age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형 : " + blood);
        System.out.println("문자 : " + munja);
        System.out.println("진위 : " + bool);
    }
}
