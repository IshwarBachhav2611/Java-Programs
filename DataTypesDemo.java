public class DataTypesDemo {
    public static void main(String[] args) {

        // Primitive Data Types
        int a = 10;
        long b = 100000L;
        float c = 3.14f;
        double d = 99.99;
        char e = 'J';
        boolean f = true;
        byte g = 100;
        short h = 5000;

        // Non-Primitive Data Type
        String name = "Java";

        System.out.println("int: " + a);
        System.out.println("long: " + b);
        System.out.println("float: " + c);
        System.out.println("double: " + d);
        System.out.println("char: " + e);
        System.out.println("boolean: " + f);
        System.out.println("byte: " + g);
        System.out.println("short: " + h);
        System.out.println("String: " + name);

        // Type Casting Example
        double x = 10.5;
        int y = (int) x;   // explicit casting

        System.out.println("Double value: " + x);
        System.out.println("After casting to int: " + y);
    }
}
