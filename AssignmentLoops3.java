public class AssignmentLoops3 {
    public static void main(String args[]) {

        int rows = 4;
        int column = 4;
        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= column; i++) {
                if (j == 1 || j == rows || i == 1 || i == column) {
                    System.out.print("$");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}