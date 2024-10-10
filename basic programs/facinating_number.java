
public class Demo {

    public static void main(String[] args) {
        int n = 194;
        int num1 = n * 2;
        int num2 = n * 3;
        String str = n + "" + num1 + num2;
        int count = 0;
        int flag = 0;
        for (char i = '1'; i <= '9'; i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == i) {
                    count++;
                }

            }
            System.out.println(count);
            if (count > 1 || count == 0) {
                flag = 1;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("it is facinating number");
        } else {

            System.out.println("it is not facinating nubmer");
        }

    }
}
