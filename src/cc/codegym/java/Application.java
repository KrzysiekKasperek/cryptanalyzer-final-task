package cc.codegym.java;

import javax.swing.*;

public class Application {
    public static void main(String[] args)  {
        String input = ReadFile.fileInput("input_text.txt");
        Encryption enc1 = new Encryption(ScannerConsole.scan());
        String encryptedMessage = enc1.encrypt(input);
        WriteFile.writeToFile("output_text.txt", encryptedMessage);
        JOptionPane.showMessageDialog(null, encryptedMessage);
        Cryptanalysis.choice(encryptedMessage);
        String decryptedMessage = enc1.decrypt(encryptedMessage);
        JOptionPane.showMessageDialog(null, decryptedMessage);
//        test of statistical analysis
        String s = "UFTU PG XPSLJOH";
        Cryptanalysis.statistic(s, s.length());

    }
}
