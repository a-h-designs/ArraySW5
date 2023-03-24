import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        //create random object
        Random random = new Random();
        //generate a random int number, save to a variable
        int[] array1 = new int[10];
        int minNum = 100;
        int maxNum = 0;
        // print the number
        System.out.println("Generating random values between 1 to 100");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100) + 1;
            System.out.print(array1[i] + " | ");
            if (array1[i] > maxNum) {
                maxNum = array1[i];
            }
            if (array1[i] < minNum) {
                minNum = array1[i];
            }
        }
        System.out.println("\nThe minimum value is: " + minNum);
        System.out.println("The maximum value is: " + maxNum);
    }
}