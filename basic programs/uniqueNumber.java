// Unique number can be defined as a number which does not have a single repeated 
// digit in it. Simply it means all the digits of that number are unique digits, no duplicate digits are there in that number.



class Demo {
    public static void main(String[] args) {
        int n = 12345;
        int cpy = n;
        int flag = 0;
        while (cpy > 0) {
            int rem = cpy % 10; //if cpy = 12345 then in inner loop number should be 1234

            for (int i = cpy / 10; i > 0; i /= 10) {
                // here i = 12345/10 =>1234 
                int temp = i % 10;
                if (temp == rem) {
                    System.out.println("not a unique number");
                    flag++;
                    break;
                }
            }
            cpy /= 10;

        }
        if (flag == 0) {
            System.out.println("unique number");
        }

    }
}
