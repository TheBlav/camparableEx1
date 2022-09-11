import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Operations {
    Random random = new Random();
    numbers number = new numbers();

    public void Operations(){
        int[] content = number.numbers();
        System.out.println("Unsorted table:");
        printTable(content);
        System.out.print("\n Table sorted in natural order:");
        sortByRise(content);
        System.out.print("\n Table sorted downwards:");
        soerByDowngrade(content);

    }

    private void soerByDowngrade(int[] content) {
        int[] sort2 = Arrays.copyOf(content, content.length);
        Integer[] sorting = new Integer[sort2.length];
        for (int i = 0; i < sorting.length; i++) {
            sorting[i] = sort2[i];
        }
        System.out.println();
        Arrays.sort(sorting, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return -1;
                else if (o1 < o2)
                    return 1;
                return 0;
            }
        });
        for (Integer item : sorting) {
            System.out.print(item + " ");
        }
    }



    private void sortByRise(int[] content) {
        int[] sort1 = Arrays.copyOf(content,content.length);
        Arrays.sort(sort1);
        System.out.println();
        printTable(sort1);
    }

    private void printTable(int[] content) {
        for (int i : content) {
            System.out.print(i + " ");
        }
    }
}
