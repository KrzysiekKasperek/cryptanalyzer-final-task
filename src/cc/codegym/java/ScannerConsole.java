package cc.codegym.java;

import javax.swing.*;

public class ScannerConsole {
    public static int scan() {
        int key = 0;

        JOptionPane.showMessageDialog(null, "Welcome to cryptanalyzer!");

        while (true) {
            String input = JOptionPane.showInputDialog("Please enter your cryptographic key: ");
            try {
                int read = Integer.parseInt(input);
                if (read < 1 || read > 26) {
                    JOptionPane.showMessageDialog(null, "A cryptographic key should be a number from 1 to 26");

                }
                else
                    key = read;
                break;
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "A cryptographic key has to be a NUMBER!");
            }




        }
        return key;

    }

}
