public class BreakContinue {
    public static void main(String[] args) {

        System.out.println("Using continue:");
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;   // skip number 3
            }

            System.out.println(i);
        }

        System.out.println("\nUsing break:");
        for (int i = 1; i <= 5; i++) {

            if (i == 4) {
                break;   // stop loop when i = 4
            }

            System.out.println(i);
        }
    }
}