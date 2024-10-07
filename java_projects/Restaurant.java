
import java.util.*;

class Restaurant {

    static String userName;
    static String pass;
    static String phone;
    static int payment;
    static int payment1;
    static int payment2;

    public static void vegDish(Scanner sc) {
        payment = 0;
        int flag = 0;

        System.out.println("-----------------------------------Veg Menu---------------------------------------");
        System.out.println();
        System.out.println("101.Dal fry ------->200/-");
        System.out.println("102.pav bhaji ----->80/-");
        System.out.println("103.paneer masala-->90/-");
        System.out.println("104.kaju kari ----->120/-");
        System.out.println("105.puran poli----->150/-");
        System.out.println("106.misal pav ----->100/-");
        System.out.println("107. Display Bill");
        System.out.println();
        System.out.println();
        for (;;) {
            System.out.println("Enter dish Id:");
            byte op = sc.nextByte();
            switch (op) {
                case 101:
                    payment += 200;
                    System.out.println("item added");
                    break;
                case 102:
                    payment += 80;
                    System.out.println("item added");
                    break;
                case 103:
                    payment += 90;
                    System.out.println("item added");
                    break;
                case 104:
                    payment += 120;
                    System.out.println("item added");
                    break;
                case 105:
                    payment += 150;
                    System.out.println("item added");
                    break;
                case 106:
                    payment += 100;
                    System.out.println("item added");
                    break;
                case 107:
                    System.out.println();
                    System.out.println("-----------------------------------order details-------------------------");
                    System.out.println();
                    System.out.println("Your order is processing...");
                    System.out.println("Your bill :" + payment + "Rs");
                    System.out.println();
                    flag++;
                    break;
                default:
                    break;
            }
            if (flag > 0) {
                break;
            }
        }
        placeOrder(sc);

    }

    public static void nonVegDish(Scanner sc) {
        payment1 = 0;
        int flag = 0;

        System.out.println("-----------------------------------Non-Veg Menu---------------------------------------");
        System.out.println();
        System.out.println("101.Chicken thali-------->250/-");
        System.out.println("102.mutton thali--------->300/-");
        System.out.println("103.Egg thali------------>150/-");
        System.out.println("104.Chicken fry(200g)---->120/-");
        System.out.println("105.Gril mutton(150g)---->150/-");
        System.out.println("106.Egg bhurgi------------>100/-");
        System.out.println("107. Display Bill");
        System.out.println();
        System.out.println();
        for (;;) {
            System.out.println("Enter dish Id:");
            byte op = sc.nextByte();
            switch (op) {
                case 101:
                    payment1 += 250;
                    System.out.println("item added");
                    break;
                case 102:
                    payment1 += 300;
                    System.out.println("item added");
                    break;
                case 103:
                    payment1 += 150;
                    System.out.println("item added");
                    break;
                case 104:
                    payment1 += 120;
                    System.out.println("item added");
                    break;
                case 105:
                    payment1 += 150;
                    System.out.println("item added");
                    break;
                case 106:
                    payment1 += 100;
                    System.out.println("item added");
                    break;
                case 107:
                    System.out.println();
                    System.out.println("-----------------------------------order details-------------------------");
                    System.out.println();
                    System.out.println("Your order is processing...");
                    System.out.println("Your bill :" + payment1 + "Rs");
                    System.out.println();
                    flag++;
                    break;
                default:
                    break;
            }
            if (flag > 0) {
                break;
            }
        }
        placeOrder(sc);
    }

    public static void seaFoodMenu(Scanner sc) {
        payment2 = 0;
        int flag = 0;

        System.out.println("-----------------------------------Non-Veg Menu---------------------------------------");
        System.out.println();
        System.out.println("101.Pampalet------->300/-");
        System.out.println("102.surmai--------->240/-");
        System.out.println("103.Bombil--------->150/-");
        System.out.println("104.Mandeli-------->120/-");
        System.out.println("105.Chilapi-------->150/-");
        System.out.println("106.Bangda--------->100/-");
        System.out.println("107. Display Bill");
        System.out.println();
        System.out.println();
        for (;;) {
            System.out.println("Enter dish Id:");
            byte op = sc.nextByte();
            switch (op) {
                case 101:
                    payment2 += 250;
                    System.out.println("item added");
                    break;
                case 102:
                    payment2 += 300;
                    System.out.println("item added");
                    break;
                case 103:
                    payment2 += 150;
                    System.out.println("item added");
                    break;
                case 104:
                    payment2 += 120;
                    System.out.println("item added");
                    break;
                case 105:
                    payment2 += 150;
                    System.out.println("item added");
                    break;
                case 106:
                    payment2 += 100;
                    System.out.println("item added");
                    break;
                case 107:
                    System.out.println();
                    System.out.println("-----------------------------------order details-------------------------");
                    System.out.println();
                    System.out.println("Your order is processing...");
                    System.out.println("Your bill :" + payment2 + "Rs");
                    System.out.println();
                    flag++;
                    break;
                default:
                    break;
            }
            if (flag > 0) {
                break;
            }
        }
        placeOrder(sc);
    }

    public static void placeOrder(Scanner sc) {
        System.out.println("--------------------------------Let's Order Something-----------------------------");
        System.out.println("1.Veg menu");
        System.out.println("2.non-Veg menu");
        System.out.println("3.Sea food menu");
        System.out.println("4.Exit");
        System.out.println("Enter your option:");
        int op = sc.nextByte();
        switch (op) {
            case 1:
                vegDish(sc);
                break;

            case 2:
                nonVegDish(sc);
                break;

            case 3:
                seaFoodMenu(sc);
                break;

            default:
                System.out.println("invalid option");
                break;
        }
    }

    public static void createAccount(Scanner sc) {
        System.out.println("Create user-name:");
        userName = sc.next();
        System.out.println("Create passward:");
        pass = sc.next();
        System.out.println("Enter your mobile number:");
        phone = sc.next();

        System.out.println();
        System.out.println("Congratulation! Account has been created succesfully");

    }

    public static void logIn(Scanner sc) {
        if (userName != null) {
            System.out.println("Enter user name:");
            String logUser = sc.next();
            System.out.println("Enter your passward:");
            String passUser = sc.next();
            if (userName.equals(logUser) && pass.equals(passUser)) {
                placeOrder(sc);
            } else {

                for (int i = 1; i <= 3; i++) {
                    System.out.println();
                    System.out.println("1.Change password");
                    System.out.println("2.Exit");
                    int option = sc.nextInt();
                    if (option == 1) {
                        System.out.println("please Enter your old passward:");
                        String oldPass = sc.next();
                        if (pass.equals(oldPass)) {
                            System.out.println("Enter new Passward:");
                            pass = sc.next();
                            System.out.println("passward has been updated!");
                        } else {
                            System.out.println("wrong passward,you have remaining " + (3 - i) + " attempts");
                        }
                    } else if (option == 2) {
                        System.out.println("exit");
                        break;
                    } else {
                        System.out.println();
                        System.out.println("---------------------Dekh ke enter kar be:-----------------------------");
                    }

                }
                System.out.println();
                System.out.println("------Warning*****Accout is locked create account again------------");
            }
        } else {
            System.out.println();
            System.out.println("please create account ,account is not created");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println();
            System.out.println("------------------------------------Welcome to TAJ-------------------------------------");
            System.out.println();
            System.out.println("1.Sign In");
            System.out.println("2.Sign Up");
            // System.out.println("3.Menu");
            // System.out.println("3.Sign Up");
            System.out.println();
            System.out.println("Enter an option:");
            byte option = sc.nextByte();
            // swith(option)
            // {    case 1:crateAccount(); break;
            //      case 2:logIn(); break;

            //     default: System.out.println("Wrong input");break;
            // }
            if (option == 1) {
                createAccount(sc);
            } else if (option == 2) {
                logIn(sc);
            } else {
                System.out.println("invalid input");
            }
        }

    }
}
