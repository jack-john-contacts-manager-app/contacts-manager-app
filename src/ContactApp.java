import util.Input;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ContactApp {


    public static void main(String[] args) throws IOException {
        ViewContacts viewContacts = new ViewContacts();
        AddContact addContact = new AddContact();
        Input input = new Input();

        Path pathToContacts = Paths.get("src", "contacts.txt");
        System.out.println(pathToContacts);

        String contactMenu = new String ("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5) and press enter:");
//        System.out.println(contactMenu);


        Scanner sc = new Scanner(System.in);
        String yesOrNo = "y";
        String userInput;
        while (yesOrNo.equalsIgnoreCase("y")){
            System.out.println(contactMenu);
                userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("1")) {
                System.out.println(viewContacts.contacts());

            } else if(userInput.equalsIgnoreCase("2")) {
                System.out.println("Enter the name: ");
                String userName = sc.nextLine();
                System.out.println("Enter the number: ");
                String phoneNumber = sc.nextLine();
                addContact.addContact(userName,phoneNumber);
                System.out.printf(userName + " | " + phoneNumber);


            } else if(userInput.equalsIgnoreCase("3")) {
                System.out.println("Search for contact info");
                String search = input.getString();
                SearchContact.searchName(search);


            } else if(userInput.equalsIgnoreCase("4")) {
                String delete = input.getString();
                DeleteContact.deleteName(delete);

            } else if(userInput.equalsIgnoreCase("5")) {
                System.out.println("Breaking out");
                break;

//            } else if(userInput.equalsIgnoreCase("n")) {
//                System.out.println("Breaking out");
//                break;
//
//            } else if(userInput.equalsIgnoreCase("y")){
//                System.out.println(contactMenu);

            } else {
                System.out.println("not a valid option");
            }
            System.out.println("");
            System.out.println("Would you like to continue? y/n");
            yesOrNo = sc.nextLine();
        }
    }


}
