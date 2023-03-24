import java.util.Scanner;

public class Array2d {
    //2 Dimension Array = array with multiple columns and rows
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String [][] students = {
                {"Harry", "Potter", "Gryffindor"},
                {"Draco", "Malfoy", "Slytherin"},
                {"Newton", "Scamander", "Hufflepuff"},
                {"Luna", "Lovegood", "Ravenclaw"},
                {"Hermione", "Granger", "Gryffindor"},
                {"Ron", "Weasley", "Gryffindor"}
        };

        boolean confirm = false;
        System.out.println("---HARRY POTTER CHARACTER INFORMATION---");
        System.out.println("Enter a character to search.");
        String guess = reader.nextLine();
        System.out.println();

        for (String[] student : students) {
            for (String s : student) {
                if (s.equalsIgnoreCase(guess)) {
                    confirm = true;
                    break;
                }
            }
        }

        if (confirm) {
            if (guess.equalsIgnoreCase("Harry") || guess.equalsIgnoreCase("Potter")) {
                System.out.println(students[0][0] + " " + students[0][1] + " - " + students[0][2]);
            } else if (guess.equalsIgnoreCase("Draco") || guess.equalsIgnoreCase("Malfoy")) {
                System.out.println(students[1][0] + " " + students[1][1] + " - " + students[1][2]);
            } else if (guess.equalsIgnoreCase("Newton") || guess.equalsIgnoreCase("Scamander")) {
                System.out.println(students[2][0] + " " + students[2][1] + " - " + students[2][2]);
            } else if (guess.equalsIgnoreCase("Luna") || guess.equalsIgnoreCase("Lovegood")) {
                System.out.println(students[3][0] + " " + students[3][1] + " - " + students[3][2]);
            } else if (guess.equalsIgnoreCase("Hermione") || guess.equalsIgnoreCase("Granger")) {
                System.out.println(students[4][0] + " " + students[4][1] + " - " + students[4][2]);
            } else if (guess.equalsIgnoreCase("Ron") || guess.equalsIgnoreCase("Weasley")) {
                System.out.println(students[5][0] + " " + students[5][1] + " - " + students[5][2]);
            }
        } else {
            System.out.println("Character not found in the database.");
        }
    }
}