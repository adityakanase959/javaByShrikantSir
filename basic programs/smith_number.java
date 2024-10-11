//code might have error //it is wrong code but logic is correct
//Sum of digits of n = Sum of digits of prime factors of n (counted with multiplicity)
public class Demo {

    static int psum;

    public static int pSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 256;
        System.out.println(isPrime(4));
        int sum = pSum(n);
        System.out.println(sum);
        int sum1 = 0;
        for (int i = 3; i <= (n / 2); i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    sum1 += pSum(i);
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println(sum1);

    }
}
