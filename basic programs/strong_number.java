
public class Demo {

    public static void main(String[] args) {
        int n = 145;
        int cpy = n;
        int sum = 0;
        while (cpy > 0) {
            int rem = cpy % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum += fact;
            cpy /= 10;
        }
        if (sum == n) {
            System.out.println("it is strong number");
        } else {
            System.out.println("not a strong nubmer");
        }
    }
}
