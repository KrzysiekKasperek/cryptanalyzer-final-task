package cc.codegym.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {
    public static void writeToFile(String location, String text) {
        try {
            Files.writeString(Path.of(location), text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
