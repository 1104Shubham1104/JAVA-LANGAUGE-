import java.util.HashSet;

public class UniqueValues {
    public static int countUniqueValues(int[] arr) {
        HashSet<Integer> uniqueValues = new HashSet<>();
        for (int value : arr) {
            uniqueValues.add(value);
        }
        return uniqueValues.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 8, 9, 10, 1, 5};
        int uniqueCount = countUniqueValues(arr);
        System.out.println("Number of unique values: " + uniqueCount);
    }
}
