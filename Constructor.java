class Calc {
    int num1;
    int num2;

    public Calc() {
        num1 = 5;
        num2 = 5;
    }

    public Calc(int n) {
        num1 = n;
        num2 = n;
    }

}

public class Constructor {
    public static void main(String args[]) {

        Calc obj = new Calc();
        System.out.println(obj.num1);

        Calc obj1 = new Calc(7);
        System.out.println(obj1.num1);
    }
}