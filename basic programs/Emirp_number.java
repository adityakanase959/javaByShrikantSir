//An emirp number is a number which is prime backwards and forwards. Example: 13 and 31 are both prime numbers. Thus, 13 is an emirp number.


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
        int n = 14;
        int num = n;
        int cpy = 0;
        while (num > 0) {
            int rem = num % 10;
            cpy = (cpy * 10) + rem;
            num /= 10;
        }
        if (isPrime(n) == true && isPrime(cpy) == true) {
            System.out.println("it is emirp number");
        } else {
            System.out.println("it is not emirp number");
        }

    }
}
