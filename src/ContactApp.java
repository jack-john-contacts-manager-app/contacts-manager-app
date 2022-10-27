import java.nio.file.Path;
import java.nio.file.Paths;

public class ContactApp {

    String menu = "1. View contacts.\n" +
            "2. Add a new contact.\n" +
            "3. Search a contact by name.\n" +
            "4. Delete an existing contact.\n" +
            "5. Exit.\n" +
            "Enter an option (1, 2, 3, 4 or 5) and press enter:";

    public static void main(String[] args) {

        Path pathToContacts = Paths.get("src", "contacts.txt");
        System.out.println(pathToContacts);

        System.out.println(menu);

        Scanner sc = new Scanner(System.in);
        String yesOrNo = "y";
        while (yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Enter a username:");
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("1")) {
                System.out.println("test");

            } else if(userInput.equalsIgnoreCase("2")) {
                System.out.println("test");

            } else if(userInput.equalsIgnoreCase("3")) {
                System.out.println("test");

            } else if(userInput.equalsIgnoreCase("4")) {
                System.out.println("test");

            } else if(userInput.equalsIgnoreCase("5")) {
                yesOrNo = "n"

            } else {
                System.out.println("not a valid option");
            }
            System.out.println("Would you like to continue? y/n");
            yesOrNo = sc.nextLine();
        }
    }


}
