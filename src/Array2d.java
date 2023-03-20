import java.util.Scanner;

public class Array2d {
    //2 Dimension Array = array with multiple columns and rows
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String [][] students = {
                {"Harry", "Potter", "Gryffindor"},
                {"Draco", "Malfoy", "Slytherin"},
                {"Newton", "Scamander", "Hufflepuff"},
                {"Luna", "Lovegood", "Ravenclaw"}
        };

        int option = 0;
        System.out.println("Enter a number and we will see if it's in our database.");
        String guess = reader.next();

        for (int i = 0; i < students.length; i++) {
            if (guess.equalsIgnoreCase("Harry")) {
                option = 1;
                break;
            } else if (guess.equalsIgnoreCase("Draco")) {
                option = 2;
                break;
            } else if (guess.equalsIgnoreCase("Newton")) {
                option = 3;
                break;
            } else if (guess.equalsIgnoreCase("Luna")) {
                option = 4;
                break;
            }
        }

        if (option == 1) {
            System.out.print(students[0][0] + " " + students[0][1] + " - " + students[0][2]);
        } else if (option == 2) {
            System.out.print(students[1][0] + " " + students[1][1] + " - " + students[1][2]);
        } else if (option == 3) {
            System.out.print(students[2][0] + " " + students[2][1] + " - " + students[2][2]);
        } else if (option == 4) {
            System.out.print(students[3][0] + " " + students[3][1] + " - " + students[3][2]);
        } else {
            System.out.print("Not found.");
        }
    }
}