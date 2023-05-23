import java.util.Scanner;

public class reverseStribng {
    public static void main(String[] args) {

        String str = "I love Java";
        String reverse = "";

        String[] cut = str.split(" ");

        for (int i = cut.length - 1; i >= 0; i--) {
            reverse += cut[i] + " ";
        }
//        System.out.println(reverse);

        String reversed2 = "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            reversed2 += reverse.charAt(i);
        }
        System.out.println(reversed2);
    }

}
