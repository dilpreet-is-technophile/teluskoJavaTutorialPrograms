class Calc {

    public int Add(int... n) {
        int sum = 0;
        for (int i : n) {
            sum = sum + i;
        }
        return sum;
    }
}

public class Varargs {
    public static void main(String args[]) {

        Calc obj = new Calc();
        System.out.println(obj.Add(10, 20));

    }
}