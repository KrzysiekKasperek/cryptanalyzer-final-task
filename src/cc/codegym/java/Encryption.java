package cc.codegym.java;

public class Encryption {
    private  final int key;

    public Encryption(int key) {
        this.key = key;
    }

    public String encrypt(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char a = (char) (text.charAt(i) + key);
            builder.append(a);
        }
        return builder.toString();
    }

    public String decrypt(String decryptedText) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < decryptedText.length(); i++) {
            char b = (char)(decryptedText.charAt(i) - key);
            builder.append(b);
        }
        return builder.toString();
    }

}
