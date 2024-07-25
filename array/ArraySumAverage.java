package array;

public class ArraySumAverage {
    public static void main(String[] args) {
        int [] score = {50,40,70,80,90,30};
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        System.out.println(sum);
    }
}
