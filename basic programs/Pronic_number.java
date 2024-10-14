//Pronic number is a number which is the product of two consecutive integers, that is, a number n is a product of x and (x+1). The task is to check and print Pronic Numbers in a range.



class Demo {

    public static void main(String[] args) {
        int n = 12;
        for (int i = 1; i <= (i * (i + 1)); i++) {
            if ((i * (i + 1)) == n) {
                System.out.println("Pronic number");
                return;
            }
        }
        System.out.println("not pronic number");

    }
}
