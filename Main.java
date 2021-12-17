import java.util.Scanner;
import library.Library;

public class Main extends Library {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int number = -1; number != 0;) {
            for (String s : menu) System.out.print("\n" + s);
            number = scanner.nextInt();
            int i;
            boolean test = false;
            switch (number) {
                case 1:
                    System.out.print(factorialMessage);
                    while (!test) {
                        i = scanner.nextInt();
                        test = factorialOutput(i);
                    }
                    break;
                case 2:
                    System.out.print(fibonacciMessage);
                    while (!test) {
                        i = scanner.nextInt();
                        test = fibonacciOutput(i);
                    }
                    break;
            }
        }
        System.out.print("Exit.");
    }
}
