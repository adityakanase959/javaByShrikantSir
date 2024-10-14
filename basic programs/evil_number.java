//convert into binary and count the nubmer of 1's if count is even then print evil number
class Demo {

    public static void main(String[] args) {
        int n = 3;
        int count = 0;
        while (n > 0) {

            if (n % 2 == 1) {
                count++;
            }

            n /= 2;
        }
        if (count % 2 == 0) {
            System.out.println("evil number");
        } else {
            System.out.println("not evil number");
        }

    }
}
