package array;

public class i ArrayMinMax {
    public static void main(String[] args) {
        int [] score = {50,40,70,80,90,30};

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
