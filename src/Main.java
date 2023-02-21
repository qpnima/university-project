import java.util.Objects;
import java.util.Scanner;

public class Main {

    User[] user = new User[100];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wellcome to university!");
        System.out.println("please create the new account.");

        System.out.println("please inter your username (letters) : ");
        String username = scanner.nextLine();
        System.out.println("please inter your password (numbers): ");
        String password = scanner.nextLine();
        System.out.println("please inter your password again (numbers): ");
        String password1 = scanner.nextLine();
        if (Objects.equals(password, password1)) {
            System.out.println("thank you.your account is created.");
            // for(int i=1;i<100;i++) {


        } else
            System.out.println("worng password. please try again.");
        scanner.close();


        // static void password(String username,String password){
        //  Scanner scanner=new Scanner(System.in);

        // int array[] = new int[id];


        System.out.println("inter your first name: ");

        String firstname = scanner.nextLine();
        System.out.print("first name:");
        System.out.println(firstname);
        System.out.println("inter your last name: ");
        String lastname = scanner.nextLine();
        System.out.print("last name: ");
        System.out.print(lastname);
        scanner.close();

    }
}

