class method {
    void add(int a, int b) {
        System.out.println("the value of summation is " + (a + b));

    }

    void add(int a, int b, int c) {
        System.out.println("the value of summation is " + (a + b + c));
    }

    void add(double a, double b, double c) {
        System.out.println("the value of summation is " + (a + b + c));
    }

    void add(int a, double b, int c) {
        System.out.println("the value of summation is " + (a + b + c));
    }

    void add(double a, int b) {
        System.out.println("the value of summation is " + (a + b));
    }
}

class overloadingex {

    public static void main(String[] args) {
        method m = new method();

        m.add(10, 12);
        m.add(12, 17, 19);
        m.add(11.3, 56.3, 63.7);
        m.add(10, 16.3, 12);
        m.add(67.9, 34);

    }
}