package statements;

public class Statements {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("A is greather than B");
        }

        if (a < b) {
            System.out.println("A is less than B");
        } else {
            System.out.println("A is greather than B");
        }

        if (a == b) {
            System.out.println("A is equal to B");
        } else if (a < b) {
            System.out.println("A is less than B");
        } else if (a == 0) {
            System.out.println("A is zero");
        } else {
            System.out.println("A is greater than B");
        }

        switch (a) {
            case 10:
                System.out.println("A is 10");
                break;
            case 20:
                System.out.println("A is 20");
                break;
            default:
                System.out.println("A is not 10 or 20");
        }

        int[] array = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int value : array) {
            System.out.println(value);
        }

        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }

        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);

        for (int j = 0; j < array.length; j++) {
            if (j == 2) {
                continue;
            }
            System.out.println(array[j]);
            if (j == 4) {
                break;
            }
        }

    }

}
