class Calculator {
    public int add(int i, int j) {
        return i + j;
    }
}

class AdvCalculator extends Calculator {
    public int sub(int i, int j) {
        return i - j;

    }

}

public class InheritanceDemo {
    public static void main(String args[]) {
        Calculator obj = new Calculator();
        AdvCalculator obj1 = new AdvCalculator();
        int result1 = obj.add(10, 20);
        int result2 = obj1.sub(4, 3);

        System.out.println(result1);
        System.out.println(result2);

    }
}