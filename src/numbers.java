import java.util.Random;

public class numbers {
    Random randomize = new Random();

    int[] table = new int[20];



    public int[] numbers() {
        for (int i = 0; i < table.length; i++) {
            table[i] = randomize.nextInt(99);
        }
        return table;
    }


}
