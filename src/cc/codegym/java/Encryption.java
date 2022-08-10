package cc.codegym.java;

import java.util.List;

public class Encryption {
    private  final int key;
//    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz.,:-!? ";

    public Encryption(int key) {
        this.key = key;
    }

    public String encrypt(String text) {
//        char[] arr = text.toCharArray();
//        for (int i = 0; i <text.length() ; i++) {
//            arr[i] = (char) ((arr[i] + key) % 128);
//        }
//        return String.valueOf(arr);
//        APPROACH - 1
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                c = (char) (c + key);
//                if (c > 'z') {
//                    c = (char) (c - 'z' + 'a' -1);
//                }
//                builder.append(c);
//            }
//            else if (c >= 'A' && c <= 'Z') {
//                c = (char) (c + key);
//                if (c > 'Z') {
//                    c = (char) (c - 'Z' + 'A' -1);
//                }
//                builder.append(c);
//            }
//            else {
//                builder.append(c);
//            }
//        }
//        return builder.toString();
//        APPROACH - 2
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char a = (char) ((text.charAt(i) + key) %128) ;
            builder.append(a);
        }
        String result = builder.toString();
        return result;
    }

    public String decrypt(String decryptedText) {
//        char[] arr = decryptedText.toCharArray();
//        for (int i = 0; i < decryptedText.length(); i++) {
//            arr[i] = (char)((arr[i] - key) % 128);
//        }
//        return String.valueOf(arr);
//        APPROACH - 1
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < decryptedText.length(); i++) {
//            char c = decryptedText.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                c = (char) (c - key);
//                if (c > 'z') {
//                    c = (char) (c - 'z' + 'a' -1);
//                }
//                builder.append(c);
//            }
//            else if (c >= 'A' && c <= 'Z') {
//                c = (char) (c - key);
//                if (c > 'Z') {
//                    c = (char) (c - 'Z' + 'A' -1);
//                }
//                builder.append(c);
//            }
//            else {
//                builder.append(c);
//            }
//        }
//        return builder.toString();
//        APPROACH - 2
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < decryptedText.length(); i++) {
            char b = (char)((decryptedText.charAt(i) + 128 - key % 128) % 128);
            builder.append(b);
        }
        return builder.toString();
    }

}
