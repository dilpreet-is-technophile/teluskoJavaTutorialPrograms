class finalvar {
    final int ABC;

    public finalvar() {
        ABC = 10;
        ABC = 20; // this cannot be done it will give error
        // remove ABC = 20; if you want to remove the error

    }

    public void printit() {
        System.out.println(ABC);
    }

}

class FinalVariable {
    public static void main(String args[]) {
        finalvar obj = new finalvar();
        obj.printit();
    }
}
