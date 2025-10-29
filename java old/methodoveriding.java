class a {
    void show() {
        System.out.println("this is class a");

    }
}

class b extends a {
    void show() {
        System.out.println("this is class b");

    }
}

class c extends b {
    void show() {
        System.out.println("this is class c");

    }
}

class methodoveriding {
    public static void main(String[] args) {
        a A = new a();
        b B = new b();
        c C = new c();

        a r;
        r = A;
        r.show();
        r = B;
        r.show();
        r = C;
        r.show();

    }
}