class Calc {
    int num1;
    int num2;

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

}

public class thisKeyword {
    public static void main(String args[]) {

        Calc obj = new Calc(10, 20);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
b  
    }
}