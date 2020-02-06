public class AssignmentLoops2 {
    public static void main(String args[]) {
        char Character = 65;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(Character);
                Character++;
            }
            System.out.println();
        }
    }
}