import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SearchContact {

// searchContact adds search functionality to be able to search for contacts by name
// and prints out the name you search by, and the match to the contact with the specified name

    static Path p = Paths.get("src", "contacts.txt");

     public static void searchName(String nameToSearch){
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String searchName : lines) {
            if (searchName.contains(nameToSearch)){
                System.out.println(searchName);
            }
        }
    }

}
