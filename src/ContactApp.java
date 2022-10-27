import java.nio.file.Path;
import java.nio.file.Paths;

public class ContactApp {








    public static void main(String[] args) {

        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");

        Path pathToContacts = Paths.get("src", "contacts.txt");
        System.out.println(pathToContacts);
    }


}
