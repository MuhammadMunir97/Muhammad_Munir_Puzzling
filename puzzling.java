/**
 * puzzling
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class puzzling {
    public ArrayList<Integer> greaterThanTen(int[] arr){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>10){
                numbers.add(arr[i]);
            }            

        }
        return numbers;
    }


}