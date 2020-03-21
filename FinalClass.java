final class A {
    public void show() {
        System.out.println("It cannot be extended");

    }
}

class B extends A {
    // this class will give error as final class cannot be extended
}

class FinalClass {
    public static void main(String[] args) {

    }
}