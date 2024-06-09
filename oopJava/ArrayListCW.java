// Array list of 9 numbers and add another number when array is created. Display
// the total of the array
package oopJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCW {
    public static void main(String[] args) {
        List<Integer> numbersArray = new ArrayList<Integer>();

        numbersArray.add(1);
        numbersArray.add(2);
        numbersArray.add(3);
        numbersArray.add(4);
        numbersArray.add(5);
        numbersArray.add(6);
        numbersArray.add(7);
        numbersArray.add(8);
        numbersArray.add(9);

        numbersArray.set(0, 0);

        // Sum = 45
        // Integer sum = 0;
        // for (Integer i = 0; i < numbersArray.size(); i++) {
        // sum = sum + numbersArray[i];
        // }

        Integer sum = 0;
        for (Integer n : numbersArray) {
            sum += n;
        }
        System.out.println("Sum of the Array: " + sum);
    }
}