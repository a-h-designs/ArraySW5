public class Array2d {
    //2 Dimension Array = array with multiple columns and rows
    public static void main(String[] args) {
        String [][] students = {
                {"Harry", "Potter", "M"},
                {"Ron", "Weasley", "M"},
                {"Hermoine", "Grainger", "F"}
        };

        for (int i=0; i < students.length; i++) {
            for (int j=0; j < students[i].length; j++) {
                System.out.println(students[i][j] + " ");
            }
            System.out.print("");
        }
    }
}