package sumanth;

class print {
    String name;

    print(String n) {
        name = n;

    }

    void show() {
        System.out.println(name + "the great");

    }

}

class mainclass {
    public static void main(String[] arg) {
        print p = new print("sumanth");
        p.show();

    }
}