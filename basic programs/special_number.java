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
        int n = 145;
        int cpy = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += fact(rem);
            n /= 10;
        }
        if (sum == cpy) {
            System.out.println("it is special number");
        } else {
            System.out.println("not special number");
        }

    }
}
