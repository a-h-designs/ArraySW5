import java.util.Scanner;

// import Scanner
public class ReverseString {
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // ask user to enter a name to reverse
        System.out.println("REVERSE NAME GENERATOR");
        System.out.println("Enter a name :");
        // get the user input, type casting from String to Char with .charAt()
        char[] letters = reader.nextLine().toCharArray();
        // use for loop to print original name
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        System.out.println("\nPrint in reverse :");
        // use for loop to print name in reverse, hint use i--, starts from the letter.length-1 to 0
        for (int i = letters.length -1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}