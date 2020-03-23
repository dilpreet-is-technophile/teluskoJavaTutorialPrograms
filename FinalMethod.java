class A {
    public final void show() {
        System.out.println("It cannot be overriden");

    }
}

class B extends A {
    public void show() {
        System.out.println("hehe I am trying to override you bitch");

    }
    // this class will give error as final method cannot be overriden
}

class FinalMethod {
    public static void main(String[] args) {

    }
}