abstract class Human {
    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {

    }
}

public class AbstractDemo {
    public static void main(String args[]) {
        Human obj = new Human(); // This will give us array that cannot instantiate type human
        obj.eat();

    }
}