import java.util.Scanner;

public class ExistinArray {
    public static void main(String[] args) {
        //crate scanner object
        Scanner reader = new Scanner(System.in);
        //create int array with 10 numbers inside
        int[] numbers = {2, 3, 5, 11, 16, 19, 20, 22, 36, 49};
        boolean userGuess = false;
        //ask user to guess the number
        System.out.println("Can you guess the correct number?");
        //save user input, int guess = reader.nextInt()
        int guess = reader.nextInt();
        //use for loop to access your array, if number[1] == guess, you found the number
        for (int number : numbers) {
            if (number == guess) {
                userGuess = true;
                break;
            }
        }
        //print if guess not available, say your guess is incorrect, otherwise say you guessed the numbers.
        if (userGuess) {
            System.out.println(guess + " has been found in the Array");
        } else {
            System.out.println(guess + " has not been found in the Array");
        }
    }
}