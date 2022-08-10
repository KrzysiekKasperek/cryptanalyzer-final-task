package cc.codegym.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Analysis {
    public static void statistic(String encryptedText, int length) {
        String mostPopularEN = "ETAOINSHRDLCUMWFGYPBVKJXQZ";
        String[] possibilities = new String[6];
        int[] frequency = new int[26];
        int[] newFreq = new int[26];
        int[] done = new int[26];

        for (int i = 0; i < length; i++) {
            if (encryptedText.charAt(i) != ' ') {
                frequency[encryptedText.charAt(i) - 'A']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            newFreq[i] = frequency[i];
        }
        Arrays.sort(newFreq);
        newFreq = reverse(newFreq);

        for (int i = 0; i < 6; i++) {
            int a = -1;
            for (int j = 0; j < 26; j++) {
                if (newFreq[i] == frequency[j] && done[j] == 0) {
                    done[j] = 1;
                    a = j;
                    break;
                }
            }
            if (a == -1)
                break;
            int b = mostPopularEN.charAt(i) - 'A';
            b = b - a;

            String temp = "";
            for (int k = 0; k < length; k++) {
                if (encryptedText.charAt(k) == ' ') {
                    temp += (char)' ';
                    continue;
                }
                int c = encryptedText.charAt(k) - 'A';
                c += b;

                if (c < 0)
                    c +=26;
                if (c > 25)
                    c -=26;

                temp += (char) ('A' + c);
            }
            possibilities[i] = temp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(possibilities[i] + "\n");
        }
    }

    static int[] reverse(int a[]) {
        int x, n = a.length, t;
        for (int i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        return a;
    }
}
