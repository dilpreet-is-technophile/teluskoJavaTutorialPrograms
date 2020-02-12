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

class VeryAdvCalculator extends AdvCalculator {
    public int mul(int i, int j) {
        return i * j;

    }

}

public class MultiLevelInheritance {
    public static void main(String args[]) {
        VeryAdvCalculator obj = new VeryAdvCalculator();

        int result1 = obj.add(10, 20);
        int result2 = obj.sub(4, 3);
        int result3 = obj.mul(2, 3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}