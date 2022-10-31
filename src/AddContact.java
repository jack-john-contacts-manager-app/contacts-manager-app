import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class AddContact {



public void addContact(String userName, String phoneNumber){

    Path p = Paths.get("src", "contacts.txt");

    List<String> names = new ArrayList<>();
    String tempString = String.format("%-14s | %-10s |",userName,phoneNumber);
    names.add(tempString);



    try {
        Files.write(p, names, StandardOpenOption.APPEND);
    } catch(IOException e) {
        e.printStackTrace();
    }

    }
}

