class Casio {

    public void Calc(int i, int j) {
        System.out.println(i + j);
    }

    public void Calc(int i, int j, int k) {
        System.out.println(i + j + k);
    }

    public void Calc(double i, double j) {
        System.out.println(i + j);
    }

}

public class MethodOverloadingDemo {
    public static void main(String args[]) {

        Casio obj = new Casio();
        obj.Calc(10, 20);
        obj.Calc(10, 20, 30);
        obj.Calc(10.5, 20.5);

    }
}