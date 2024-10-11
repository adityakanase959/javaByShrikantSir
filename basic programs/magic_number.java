
public class Demo {

    public static int reSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 9999914;
        int flag = 0;
        int sumOfDigits = n;

        for (;;) {
            sumOfDigits = reSum(sumOfDigits);
            System.out.println(sumOfDigits);
            if (sumOfDigits == 1) {
                flag = 1;
                System.out.println("it is Magic number");
                break;
            } else if (sumOfDigits > 1 && sumOfDigits <= 9) {
                System.out.println("it is not magic number");
                break;
            }
        }

    }
}
