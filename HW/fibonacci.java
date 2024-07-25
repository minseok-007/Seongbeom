package HW;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 10; i++) {
            int next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }
    }
}
