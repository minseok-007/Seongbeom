package oop;

public class MethodExample {
    static void add(int x, int y) {
        System.out.println(x + y);
    }

    int max(int a, int b) {
        if (a > b) {
            return a; // 조건식이 참일 때만 실행됨.
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        add(a,b);
    }
}
