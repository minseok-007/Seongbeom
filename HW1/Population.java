package HW1;

public class Population {
    public static void main(String[] args) {
        int[][] population = {
                {100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210},
                {95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150},
                {150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205}
        };

        int highest = 0;
        int highestIndex = 0;
        for (int i = 0; i < population.length; i++) {
            int annualPopulation = 0;
            int maxIncrease = 0;

            for (int j = 0; j < population[i].length; j++) {
                annualPopulation += population[i][j];
                if (j > 0) {
                    int increase = population[i][j] - population[i][j - 1];
                    if (increase > maxIncrease) {
                        maxIncrease = increase;
                    }
                }
            }

            System.out.println(annualPopulation / 12);

        }




    }
}

/*
Queue: FIFO

Stack: LIFO

Input stack, output stack

enqueue(1)
enqueue(2)
enqueue(3)

Input: 2   3
Ouput: 3   
 */
