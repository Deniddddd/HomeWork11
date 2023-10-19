import java.util.Random;
import java.util.stream.IntStream;


import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[2][25];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(23)+18;

            }
        }
        int[] newArray = new int[array.length];
        int[] newaverage = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[i] += array[i][j];
                newaverage[i] =(newArray[i])/25;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(newArray)+"загальний вік гравців");
        System.out.println(Arrays.toString(newaverage)+"середній вік гравців");
    }
}
