//Given a number, check whether it is a mystery number or not. A mystery number is a number that can be expressed as the sum of two numbers and those two numbers should be the reverse of each other.
class Demo {

    public static int rev(int n) {
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = (reverse * 10) + rem;
            n /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n = 22;

        for (int i = 1; i <= (n / 2); i++) {
            if (i + rev(i) == n) {
                // System.out.println(i + "  " + rev(i));
                System.out.println("it is Mystery Number");
                return;
            }
        }
        System.out.println("not a mystery number");
    }
}
