import java.lang.reflect.Array;
import java.util.*;

public class Tasks {

    Scanner scanner = new Scanner(System.in);

    public Tasks() {
        taskSix();
    }

    public void taskTwo() {
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


    public void taskThree() {
        System.out.print("Give me a number between 1 and 7: ");
        byte inputNumber = scanner.nextByte();
        switch (inputNumber) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Not between 1 and 7");
        }
    }

    public void taskFour() {
        System.out.print("Give me a number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Give me an other number: ");
        int numberTwo = scanner.nextInt();
        if (numberOne > numberTwo) {
            System.out.println("First number is greater!");
        }
        else if ( numberOne < numberTwo) {
            System.out.println("Second number is greater!");
        }
        else {
            System.out.println("They are equal!");
        }
    }

    public void taskFive() {
        System.out.print("Give me a number: ");
        try {
            int numberOne = scanner.nextInt();
            if (numberOne%2 == 0) {
                System.out.println("Even number!");
            }
            else {
                System.out.println("Odd number!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong number biacs");
        }
    }

    public void taskSix() {
        boolean userWantsMore = true;
        List<Integer> numbers = new ArrayList<Integer>();
        while (userWantsMore) {
            System.out.print("Give me a number: ");
            numbers.add(scanner.nextInt());
            System.out.println("Do you want to add more numbers?(Y/N)");
            String answer = scanner.next();
            if (answer.equals("N")) {
                System.out.println("Thanks");
                userWantsMore = false;
            }
        }

        Collections.sort(numbers);

        for(int i=0; i<numbers.size();i++ )
        {
            System.out.println(numbers.get(i));
        }





    }
}
