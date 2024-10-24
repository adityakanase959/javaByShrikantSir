
import java.util.*;

class LaxmiBank {

    static String userName;
    static Long mob;
    static String pan;
    static Long adhar;
    static int pin;
    static String address;
    static Long balance = 1000020l;

    public static void main(String[] args) {
        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("-----------------------------------------Welcome to Laxmi Bank--------------------------------------");
            System.out.println();
            System.out.println("1.logIn");
            System.out.println("2.Create account");

            switch (sc.nextInt()) {
                case 1:
                    logIn(sc);
                    break;
                case 2:
                    createAccount(sc);
                    break;
                default:
                    System.out.println("dekh ke enter kar be");
                    break;

            }
        }
    }

    public static void logIn(Scanner sc) {

        System.out.println("------------------------------------Log In ---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Enter user name:");
        String user = sc.next();
        System.out.println("Enter your passward");
        int pass = sc.nextInt();
        if (userName != null) {

            if (userName.equals(user) && pin == pass) {
                homePage(sc);

            } else if (userName.equals(user) && !(pin == pass)) {
                System.out.println("Invalid pin , try again..");
            }

        } else {
            System.out.println("Invalid user!!");
            createAccount(sc);
        }

    }

    public static void createAccount(Scanner sc) {
        System.out.println("---------------------------------Create Account----------------------------");
        System.out.println();
        System.out.println("Enter your details Below:");
        System.out.println();
        System.out.println("Enter user-name");
        userName = sc.next();
        System.out.println("Enter mobile no");
        mob = sc.nextLong();
        System.out.println("Enter PAN card number:");
        pan = sc.next();
        System.out.println("Create pin:");
        pin = sc.nextInt();
        System.out.println("Enter your addess");
        address = sc.nextLine();

        System.out.println();
        System.out.println();
        System.out.println("Congrats!! your account has been created");

    }

    public static void homePage(Scanner sc) {
        System.out.println("----------------Home page-------------");
        System.out.println();
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit cash");
        System.out.println("3.Withdraw cash");
        System.out.println("4.Statement");
        System.out.println("5.Transfer Amount");
        System.out.println("6.edit Profile");
        System.out.println();
        System.out.println("Enter your option");
        switch (sc.nextInt()) {
            case 1:
                checkBalance(sc);
                break;
            case 2:
                depositCash(sc);
                break;
            case 3:
                withdrawCash(sc);
                break;
            case 4:
                statement(sc);
                break;
            case 5:
                transeferAmount(sc);
            case 6:
                editProfile(sc);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void checkBalance(Scanner sc) {
        System.out.println();
        System.out.println("--------------------------Check Balance-----------------------");
        System.out.println();
        System.out.println("Enter your 4 digit pin:");
        int pass = sc.nextInt();
        for (;;) {
            if (pin == pass) {
                System.out.println("Your current balance is:  " + balance);
                break;
            } else {
                System.out.println("Wrong passward ,try again");
            }
        }
        homePage(sc);
    }

    public static void depositCash(Scanner sc) {
        System.out.println();
        System.out.println("-------------------------------Deposit cash---------------------------------");
        System.out.println();
        System.out.println("Enter your 4 digit pin:");
        int pass = sc.nextInt();
        for (;;) {
            if (pin == pass) {
                System.out.println("Enter amount you want to Deposit:");
                Long temp = sc.nextLong();
                balance += temp;
                System.out.println();
                System.out.println(" Amount has been diposited!!");
                System.out.println("Your balance is :" + balance);
                break;
            } else {
                System.out.println("Wrong passward ,try again");
            }
        }
        homePage(sc);
    }

    public static void withdrawCash(Scanner sc) {
        System.out.println();
        System.out.println("----------------------------Cash Withdraw---------------------");
        System.out.println();
        System.out.println("Enter your 4 digit pin:");
        int pass = sc.nextInt();

        if (pin == pass) {
            System.out.println("Enter the amount you want to withdraw");
            System.out.println();
            Long temp = sc.nextLong();
            balance -= temp;
            System.out.println();
            System.out.println("collect your cash");
            System.out.println("Your balance is :" + balance);

        } else {
            System.out.println("Wrong passward");
        }
        homePage(sc);
        // System.exit(0);
    }

    public static void statement(Scanner sc) {

    }

    public static void transeferAmount(Scanner sc) {
        System.out.println();
        System.out.println("----------------------------Bank transfer---------------------");
        System.out.println();
        System.out.println("Enter bank Details:");
        System.out.println();
        // System.out.print("Bank name:");
        // String bankName = sc.next();
        // System.out.print("IFSC CODE:");
        // String ifsc = sc.next();
        // System.out.println("Account Number:");
        // Long accountNo = sc.nextLong();
        System.out.println("Enter amount:");
        Long amount = sc.nextLong();
        System.out.println();
        System.out.print("Enter 4 digits pin:");
        Long pass = sc.nextLong();

        if (pin == pass) {
            System.out.println();
            balance -= amount;
            System.out.println();
            System.out.println("Transaction is done!!");
            System.out.println("Your balance is :" + balance);

        } else {
            System.out.println("Wrong passward ");
        }
        homePage(sc);

    }

    public static void editProfile(Scanner sc) {
        System.out.println();
        System.out.println("do you want to edit profile (y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            System.out.println("enter Pin:");
            int pass = sc.nextInt();
            if (pass == pin) {
                System.out.println("enter new username");
                userName = sc.next();
                System.out.println("Enter new pin");
                pin = sc.nextInt();
            } else {
                System.out.println("sorry , wrong passward");
            }
        } else {
            System.out.println("have a good day");
        }

    }

}
