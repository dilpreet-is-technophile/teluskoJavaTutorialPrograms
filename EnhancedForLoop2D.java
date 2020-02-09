public class EnhancedForLoop2D {
    public static void main(String args[]) {

        int a[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4, 5 } };
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

    }
}