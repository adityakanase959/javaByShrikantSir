//A number is said to be twisted prime if it is a prime number and reverse of the number is also a prime number
class Demo {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 98;
        int rev = 0;
        if (isPrime(n)) {
            while (n > 0) {
                int rem = n % 10;
                rev = (rev * 10) + rem;
                n /= 10;
            }
            if (isPrime(rev)) {
                System.out.println("it is Twisted Prime number");
            } else {
                System.out.println("it is not twisted prime number");
            }
        } else {
            System.out.println("it is not twisted prime number");
        }

    }
}
