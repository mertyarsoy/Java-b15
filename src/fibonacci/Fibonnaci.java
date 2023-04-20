package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();


        System.out.println("Please input the limit: ");
        int limit = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(num, num2);

        int sum;

        for (int i = 0; i <= limit; i++) {
            sum = num + num2;
            list.add(sum);
            num = num2;
            num2 = sum;
        }
        System.out.println(list);


    }
}
