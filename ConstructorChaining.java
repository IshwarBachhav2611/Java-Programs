class ConstructorChaining{

    ConstructorChaining() {
        this(10);
        System.out.println("Default");
    }

    ConstructorChaining(int x) {
        System.out.println("Parameterized: " + x);
    }

    public static void main(String[] args) {
        new ConstructorChaining();
    }
}