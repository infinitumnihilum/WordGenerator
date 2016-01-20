
/**
 * Created by jrdavis on 1/20/16.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class WordGenerator {


// user input for a string to convert
// create array of the characters in s(user input)

    Scanner input = new Scanner(System.in);
    String s = input.next();
    char[] ch = s.toCharArray();
    char array[] = ch;


    public char getRandomCharacter() {
        return array[random(array.length)];
    }

    public int random(int length) {
        return new Random().nextInt(length);
    }

    //Takes in the number of words you want to create
    public WordGenerator() {
        System.out.println("max number of words");
        int num = input.nextInt();

        //variables for random generator
        boolean running = true;
        int count = 0;

        ArrayList<String> masterList = new ArrayList<String>();
        Collections.sort(masterList);

        while (running) {
            StringBuilder sb = new StringBuilder();
            int size = random(25) + random(25);
            for (int i = 0; i < size; i++) {
                sb.append(getRandomCharacter());

            }
            // converts the Stringbuilder to an array and sorts it
            String sort = sb.toString();
            ArrayList<String> myList = new ArrayList<String>(Arrays.asList(sort.split(" ")));


            for (int i = 0; i < myList.size(); i++) {
                masterList.add(myList.get(i));


            }
            //takes in user input for number of words
            if (count++ == num - 1) {
                running = false;
            }
        }

        //Sorts the Master list derived from lists created in the while loop
        Collections.sort(masterList);
        for (int j = 0; j < masterList.size(); j++) {
            masterList.add(masterList.get(j));

            System.out.println(masterList);                     //prints out the master list array


        }

    }

    public static void main(String[] args) {
        // user input for a string to convert

        System.out.println("Enter characters to make random words");
        new CharConverter();
    }


}
