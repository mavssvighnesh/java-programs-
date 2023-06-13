abstract class abstractclass {

    int d1;
    int d2;

    abstractclass(int a, int b) {
        d1 = a;
        d2 = b;

    }

    abstract void area();

}

class rectangle extends abstractclass {
    rectangle(int a, int b) {
        super(a, b);

    }

    void area() {
        System.out.println("the area of rectangle is :" + (d1 * d2));

    }
}

class triangle extends abstractclass {
    triangle(int a, int b) {
        super(a, b);

    }

    void area() {
        System.out.println("the area of triangle is :" + (0.5 * d1 * d2));

    }
}

class main {

    public static void main(Strings [] ) {

        abstractclass ob;
        rectangle r = new rectangle(10, 11);
        triangle t = new triangle(8, 28);

        ob = r;
        ob.area();
        ob = t;
        ob.area();

    }
}
