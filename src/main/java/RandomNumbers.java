import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RandomNumbers {
    private List<Integer> drawnNumbers = new ArrayList<>();

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getCountOfRandomNumber();

      System.out.println(randomNumbers.getMAx());
        System.out.println(randomNumbers.getMin());
    }

    public int getCountOfRandomNumber() {
        Random random = new Random();
        int result = 0;
        int sumOfNumbers = 0;

        while (sumOfNumbers < 5000) {
            int temp = random.nextInt(31);
            drawnNumbers.add(temp);
            sumOfNumbers = sumOfNumbers + temp;
            result++;
        }
        return result;
    }
    public int getMAx() {
        int max = drawnNumbers.get(0);
        for (int numberIndex = 0; numberIndex < drawnNumbers.size(); numberIndex++) {
            if (drawnNumbers.get(numberIndex) > max) {
                max = drawnNumbers.get(numberIndex);
            }
        }
        return max;
    }
    public int getMin() {
        int min = drawnNumbers.get(0);
        for (int numberIndex = 0; numberIndex <drawnNumbers.size(); numberIndex++) {
            if (drawnNumbers.get(numberIndex) < min) {
                min = drawnNumbers.get(numberIndex);
            }
        }
        return min;
    }
}