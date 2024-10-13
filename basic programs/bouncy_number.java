
class Demo {

    public static void main(String[] args) {
        int n = 54921;
        //4>3 -->3>2 -> 2>9 ->9>0
        int gt = 0;
        int lt = 0;
        int length = 0;
        int cpy = n / 10;
        boolean flag = true;
        while (cpy > 0) {
            int rem = n % 10;
            int rem2 = cpy % 10;
            System.out.println(rem + " " + rem2);
            if (rem > rem2) {
                gt++;
            } else {
                lt++;
            }
            n /= 10;
            cpy /= 10;
        }
        // System.out.println(gt + " " + lt);
        if (gt == 0 || lt == 0) {
            System.out.println("not bouncy number");
        } else {
            System.out.println("bountcy number");
        }

    }
}
