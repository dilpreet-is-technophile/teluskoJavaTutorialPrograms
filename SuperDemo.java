class A {
    public A() {
        System.out.println("in A");
    }

    public A(int a) {
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        System.out.println("in B");
    }

    public B(int a) {
        super(a);
        System.out.println("in B int");
    }
}

class SuperDemo {
    public static void main(String args[]) {
        B obj = new B(4);

    }
}