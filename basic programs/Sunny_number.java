//a number N is a sunny nubmer if N+1 is a perfect square root eg: 8 => 8+1 =>9 ,so 9 is square of 3 meas 8 is sunny number
class Demo {

    public static boolean isSqrt(int n) {
        for (int i = 1; (i * i) <= n; i++) {
            if ((i * i) == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 8;
        if (isSqrt(n + 1)) {
            System.out.println("it is sunny number");
        } else {
            System.out.println("it is not sunny number");
        }
    }
}
