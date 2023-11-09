
class demo {
    int val1;
    int val2;

    demo() {
        val1 = 10;
        val2 = 20;
        System.out.println("inside lst constructor");

    }

    demo(int a, int b) {
        val1 = a;
        val2 = b;
        System.out.println("inside 2nd constructor");

    }

    public void display() {
        System.out.println("values=" + val1);
        System.out.println("values=" + val2);

    }

    public void display(int val1) {
        System.out.println("inside overloading function:");
        System.out.println("values=" + val1);

    }

};

public class overloading {
    public static void main(String[] args) {
        demo d1 = new demo();
        demo d2 = new demo(30, 60);
        d1.display();
        d2.display();
        d2.display(50);

    }
}