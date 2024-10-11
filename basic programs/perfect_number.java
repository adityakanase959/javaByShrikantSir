// A number is known as Special number when sum of the factorial of digits is equal to the original number (given number). Examples: Below are examples of numbers which are Special. Number to check : 145 1! + 4!

public class Demo {

    public static int fact(int n) {
        int ans = 1;
        while (n > 0) {
            ans *= n--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                // System.out.println(i);
                sum += i;
            }

        }
        if (sum == n) {
            System.out.println("it is a perfect number");
        } else {
            System.out.println("not a perfect number");
        }

    }
}
