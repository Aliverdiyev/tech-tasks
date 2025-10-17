package homework3;

public class Task7 {
    public static void main(String[] args) {
        String sentence = "Java is awesome";

        sentence = sentence.toLowerCase().replace(" ", "");

        int[] count = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + " - " + count[i]);
            }
        }
    }
}