import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 4, 3, 2, 1};

        // Checking if array1 and array2 are equal
        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("array1 and array2 are equal: " + isEqual);

        // Checking if array1 and array3 are equal
        isEqual = Arrays.equals(array1, array3);
        System.out.println("array1 and array3 are equal: " + isEqual);
    }
}
