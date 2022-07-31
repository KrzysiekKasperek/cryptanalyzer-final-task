package cc.codegym.java;

public class Application {
    public static void main(String[] args) {
        String testMessage = "Let's see how the things are going with the project";
        Encryption enc1 = new Encryption(5);
        String encryptedMessage = enc1.encrypt(testMessage);
        System.out.println(encryptedMessage);
        String decryptedMessage = enc1.decrypt(encryptedMessage);
        System.out.println(decryptedMessage);

    }
}
