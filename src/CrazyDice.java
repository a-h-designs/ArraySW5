//this program will generate random number
//import random class
import java.util.Random;

public class CrazyDice {
    public static void main(String[] args) {
        //create random object
        Random random = new Random();
        //generate a random int number, save to a variable
        int x = random.nextInt(12) + 1;//boundary 1 to 12
        // print the number
        System.out.println(x);
    }
}