import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number: ");
        float inputNumber = scanner.nextFloat();
        if (inputNumber > 0) {
            System.out.print(inputNumber + " is positive and ");
        }
        else if ( inputNumber == 0) {
            System.out.print("Number is 0");
        }

        else {
            System.out.print(inputNumber + " is negative and ");
        }
        if ( (1000000 > inputNumber && inputNumber != 0) | (inputNumber > -1000000 && inputNumber != 0)) {
            System.out.print("a small number");
        }
        else if (inputNumber != 0) {
            System.out.print(" a large number");
        }
    }
}
