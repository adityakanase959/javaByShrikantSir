//if the sum of all digits are equal to product of all digits
class Demo {

    public static void main(String[] args) {
        int n = 1241;
        int sum = 0;
        int pro = 1;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            pro *= rem;
            n /= 10;
        }
        if (sum == pro) {
            System.out.println("it is spy number");
        } else {
            System.out.println("it is not spy number");
        }

    }
}
