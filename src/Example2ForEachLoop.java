public class Example2ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 11, 16, 19, 20, 22, 36, 49};
        System.out.println("Add all of these numbers together");
        //use for each to print all elements
        for (int element:numbers) {
            System.out.print(element + " ");
        }
        System.out.println("\nCalculating sum in progress....");
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
            System.out.println(sum);
        }
        System.out.println("The total is " + sum);
        // extension calculate average and print, double average = sum/10;
        double average = (double)sum/10;
        System.out.println("The average is : " + average);
    }
}