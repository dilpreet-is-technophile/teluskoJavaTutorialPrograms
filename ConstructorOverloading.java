class Casio {

    public Casio(int x) {
        int i = x;
        int j = 0;
        int k = 0;
        System.out.println(i + j + k);
    }

    public Casio(int x, int y) {
        int i = x;
        int j = y;
        int k = 0;
        System.out.println(i + j + k);
    }

    public Casio(int x, int y, int z) {
        int i = x;
        int j = y;
        int k = z;
        System.out.println(i + j + k);
    }

}

public class ConstructorOverloading {
    public static void main(String args[]) {

        Casio obj = new Casio(4, 5, 6);

    }
}