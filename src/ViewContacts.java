import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ViewContacts {

//    public String getContacts(){
////        for (String contacts : lines) {
////            System.out.println(contacts);
////        }
//    }

    public String contacts() {

        Path p = Paths.get("src", "contacts.txt");

        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(p);
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        for (String contacts : lines) {
            System.out.println(contacts);

        }
            return "";
    }

}
