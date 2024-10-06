
class Demo {

    public static void main(String[] args) {
        int n = 3;
        int num = n * n;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        if (sum == n) {
            System.out.println("neon number");
        } else {
            System.out.println("not neon number");
        }

    }
}
