/**
 * puzzling
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class puzzling {
    // function for puzzle one
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

    // function for puzzle two
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

    //function for puzzle number 3
    public void letters(){
        ArrayList<String> alphabets = new ArrayList<String>();
        for (int i = (int) 'a'; i < ('a'+26); i++) {
            alphabets.add(Character.toString((char) i));
        }
        // System.out.println(alphabets);
        Collections.shuffle(alphabets);
        System.out.println("First letter is  " + alphabets.get(0));
        System.out.println("last letter is  " + alphabets.get(25));
        
        if ( alphabets.get(0).charAt(0) ==  'a' || alphabets.get(0).charAt(0) == 'e' || alphabets.get(0).charAt(0) == 'i'  || alphabets.get(0).charAt(0) == 'o' || alphabets.get(0).charAt(0) == 'u')
        {
            System.out.println("first letter is a vowel");
        }

       
    }

    // function for puzzle 4
    public ArrayList<Integer> randNumber(){
        Random rand = new Random();    
        ArrayList<Integer> randNumbers = new ArrayList<Integer>();
        while(randNumbers.size() < 10){
            int randNum = rand.nextInt(100);
            if (randNum > 54){
                randNumbers.add(randNum);
            }
        }
        return randNumbers;

    }

    // function for puzzle 5
    public ArrayList<Integer> sortedRandNum(){
        ArrayList<Integer> randNumbers = new ArrayList<Integer>();
       // System.out.println(randNumber());
        randNumbers = randNumber();
        Collections.sort(randNumbers);
        return randNumbers;
    }

    //function for puzzle 6
    public String randString(){
        Random rand = new Random();    
        String str = "";
        while(str.length() < 5){
            int random = rand.nextInt(127);
            if (random > 32){
            str += Character.toString((char) random);
            }
        }
        return str;

    }

    // function for puzzle 7
    public ArrayList<String> randStringArr(){
    ArrayList<String> arrString = new ArrayList<String>();
    while (arrString.size()<10){
        arrString.add(randString());
    }
    return arrString;
    }

}