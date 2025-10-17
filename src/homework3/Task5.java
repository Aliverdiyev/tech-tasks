package homework3;

public class Task5 {
    public static void main(String[] args) {
        String input = "OpenAI";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        //    string builder
        String reversed2 = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string2: " + reversed2);
    }
}