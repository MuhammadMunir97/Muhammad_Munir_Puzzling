/**
 * puzzling
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class puzzling {
    public ArrayList<Integer> greaterThanTen(int[] arr){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i]>10){
                numbers.add(arr[i]);
            }            
        }
        System.out.println("sum for the array is: " + sum);
        return numbers;
    }
    public ArrayList<String> greaterThanFive(String[] names){
        ArrayList<String> name = new ArrayList<String>();
        Random rand = new Random();
        // shuffling the array 20 times
        String temp = "";
        for (int i = 0; i < 20; i++) {
            int randInd = rand.nextInt(names.length);
            int randInd2 = rand.nextInt(names.length);
            temp = names[randInd];
            names[randInd] = names[randInd2];
            names[randInd2] = temp;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println((i+1) + ": " + names[i]);
            if (names[i].length() > 5){
                name.add(names[i]);
            }            
        }
        return name;
    }


}