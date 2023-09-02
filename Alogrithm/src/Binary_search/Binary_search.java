package Binary_search;
import java.util.Scanner;

public class Binary_search {

    public static void main(String[] args) {
        Search ss = new Search();
        ss.search();
    }
}

class Search {
    int[] array = new int[6];
    Scanner sc = new Scanner(System.in);

    int search() {
        System.out.println("ENTER SORTED ARRAY");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        if (!isSorted(array)) {
            System.out.println("Not in sorted order");
            return -1;
        }

        System.out.println("ENTER KEY TO SEARCH");
        int key = sc.nextInt();
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];

            if (key == guess) {
                System.out.println("Key found at index: " + mid);
                return 0;
            }

            if (guess > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Key not found");
        return -1;
    }

    private boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
