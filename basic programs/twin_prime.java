//Twin primes refer to a pair of prime numbers that have a difference of 2. In other words, they are prime numbers that are adjacent 
//to each other with no other primes in between. Eg of twin primes: (3, 5), (11, 13), (17, 19).
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
        int start = 3;
        int end = 200;
        while (start <= end) {

            if ((isPrime(start) == true) && (isPrime(start + 2) == true)) {
                System.out.println(start + "," + (start + 2));
                start += 2;
            } else {
                start++;
            }
        }

    }
}
