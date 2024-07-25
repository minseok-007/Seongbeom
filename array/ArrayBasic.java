package array;

public class ArrayBasic {
    public static void main(String[] args) {
        // 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것 --> Array is a data structure that forms different values of same type into one part

        int [] mathScores = new int[5];
        // the first index of an array is 0 (not 1)
        mathScores[0] = 100;
        mathScores[1] = 95;
        mathScores[2] = 90;
        mathScores[3] = 80;
        mathScores[4] = 85;

        int [] mathScores2 =  {100, 50, 40, 20, 30};
        System.out.println(mathScores2[4]);

        for (int i = 0; i < mathScores2.length; i++) {
            mathScores2[i] = i * 10 + 50;
        }

        for (int i = 0; i < mathScores2.length; i++) {
            System.out.println(mathScores2[i]);
        }
    }
}
