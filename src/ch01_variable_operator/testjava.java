package ch01_variable_operator;

public class testjava {
    public static void main(String[] args) {

        String name = "홍길동";
        double x = 40.0 ;
        double y = 43.0 ;
        double z ;
        z = (x+y)/2 ;

        String message = "이름 ; " + name;
        System.out.println(message);
        System.out.println("국어 : "+ x);
        System.out.println("영어 : "+ y);
        System.out.println("평균 : " + z);

    }
}
