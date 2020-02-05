public class ArrayDemoJagged {
    public static void main(String args[]) {
        int d[][] = { { 1, 2, }, { 3, 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}