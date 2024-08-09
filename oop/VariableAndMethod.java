package oop;

public class VariableAndMethod {
    // Variable: class variable, instance variable, local variable --> depends on the location of the variable
    int iv; // 클래스 영역에 선언됨. 클래스의 인스턴스를 생성할 때 만들어짐. 인스턴스는 독립적인 저장공간을 자기므로 서로 다른 값을 가질 수 있음.
    static int cv; // 모든 인스턴스가 공토된 저장공간을 공유하게 됨. 인스턴스를 생성하지 않고도 언제라도 바로 사용 가능.
    void method() {
        int lv = 0; // 메서드나 loop 안에서만 사용 가능
    }
}

class Card {
    String shape;
    int number;
    static int width = 100;
    static int height = 200;
}


class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.shape = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.shape = "Spade";
        c2.number = 5;
        System.out.println(c1.shape + " " + c1.number + " " +  Card.width + " " + Card.height);
        System.out.println(c2.shape + " " + c2.number);
    }
}