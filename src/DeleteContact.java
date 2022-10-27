import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DeleteContact {

    static Path p = Paths.get("src", "contacts.txt");


    static void deleteName(String nameToDelete) throws IOException {
        List<String> updatedNames = new ArrayList<>();
        for (String name : readLines()) {
            if (!name.contains(nameToDelete)) {
                updatedNames.add(name);
            }
        }
       Files.write(p, updatedNames);
    }

    private static void writeLines(List<String> lines) {
        try {
            Files.write(p, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<String> readLines() {
        List<String> names;
        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    private static void greetNames() {
        for (String name : readLines()) {
            System.out.printf("%s%n", name);
        }
    }

}


