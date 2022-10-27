import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ContactApp {


    public static void main(String[] args) {
        ViewContacts viewContacts = new ViewContacts();

        Path pathToContacts = Paths.get("src", "contacts.txt");
        System.out.println(pathToContacts);

        String contactMenu = new String ("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5) and press enter:");

//        System.out.println("1. View contacts.\n" +
//                "2. Add a new contact.\n" +
//                "3. Search a contact by name.\n" +
//                "4. Delete an existing contact.\n" +
//                "5. Exit.\n" +
//                "Enter an option (1, 2, 3, 4 or 5) and press enter:");
        System.out.println(contactMenu);

        Scanner sc = new Scanner(System.in);
        String yesOrNo = "y";
        while (yesOrNo.equalsIgnoreCase("y")){
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("1")) {
                System.out.println(viewContacts.contacts());

            } else if(userInput.equalsIgnoreCase("2")) {
                System.out.println("test2");

            } else if(userInput.equalsIgnoreCase("3")) {
                System.out.println("test3");

            } else if(userInput.equalsIgnoreCase("4")) {
                System.out.println("test4");

            } else if(userInput.equalsIgnoreCase("5")) {
                System.out.println("Until next time");
                break;

            } else if(userInput.equalsIgnoreCase("n")) {
                System.out.println("Until next time");
                break;

            } else if(userInput.equalsIgnoreCase("y")){
                System.out.println(contactMenu);

            } else {
                System.out.println("not a valid option");
            }
            System.out.println("Would you like to continue? y/n");
//            yesOrNo = sc.next();
        }
    }


}
