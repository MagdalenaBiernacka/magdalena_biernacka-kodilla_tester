import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RandomNumbers {
//    private List<Integer> drawnNumbers = new ArrayList<>();

    private int max = 0;
    private int min = 100;

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getCountOfRandomNumber();

    }

    public int getCountOfRandomNumber() {
        Random random = new Random();
        int result = 0;
        int sumOfNumbers = 0;

        while (sumOfNumbers < 5000) {
            int temp = random.nextInt(31);
//            drawnNumbers.add(temp);
            System.out.println(temp);
            getMAx(temp);
            getMin(temp);
            sumOfNumbers = sumOfNumbers + temp;
            result++;
        }
        System.out.println("Wartość max " + max);
        System.out.println("Wartość min " + min);
        return result;
    }

    public void getMAx(int number) {
//        int max = drawnNumbers.get(0);
//        for (int numberIndex = 0; numberIndex < drawnNumbers.size(); numberIndex++) {
//            if (drawnNumbers.get(numberIndex) > max) {
//                max = drawnNumbers.get(numberIndex);
//            }
//        }
//        return max;
        if (number > max) max = number;
    }

    public void getMin(int number) {
//        int min = drawnNumbers.get(0);
//        for (int numberIndex = 0; numberIndex <drawnNumbers.size(); numberIndex++) {
//            if (drawnNumbers.get(numberIndex) < min) {
//                min = drawnNumbers.get(numberIndex);
//            }
//        }
//        return min;
        if (number < min) min = number;
    }
}