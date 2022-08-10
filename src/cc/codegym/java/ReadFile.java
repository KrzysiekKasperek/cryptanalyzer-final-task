package cc.codegym.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public ReadFile() {
    }

    public static String fileInput(String fileLoc) {
        List<String> inputList = new ArrayList<>();
        try {
            inputList = Files.readAllLines(Path.of(fileLoc));
        }
        catch (IOException e) {
            System.out.println("Incorrect input line");
            e.printStackTrace();
        }
        return inputList.toString();
    }
}
