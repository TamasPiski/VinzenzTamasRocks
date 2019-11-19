import java.util.Scanner;

public class TasksVinz {

    public  void task1() {

        int x = -10;

        if (x<0){
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
    }

    public void task2() {

        double y;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        y = Double.parseDouble(sc.nextLine());

        if (y == 0) {
            System.out.println("zero");
        } else if (y < 0) {
            System.out.println("negative");
        } else if (y < 1) {
            System.out.println("small");
        } else if (y >= 1000000) {
            System.out.println("large");
        } else if (y > 0) {
            System.out.println("positive");
        }
    }

    public void task3() {
        String s = "Today is ";
        int day;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Day:");
        day = Integer.parseInt(sc.nextLine());

        if(day==1){
            System.out.println(s+"Monday");
        }else if(day==2){
            System.out.println(s+"Tuesday");
        }else if(day==3){
            System.out.println(s+"Wednesday");
        }else if(day==4){
            System.out.println(s+"Thursday");
        }else if(day==5){
            System.out.println(s+"Friday");
        }else if(day==6){
            System.out.println(s+"Saturday");
        }else if(day==7){
            System.out.println(s+"Sunday");
        }else if(day>7){
            System.out.println("a week only has 7 days");
        }
    }

    public void task4() {

        int day;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Day:");
        day = Integer.parseInt(sc.nextLine());

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a weekday");
        }
    }

    public void task5(){
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a another Number: ");
        num2 = Integer.parseInt(sc.nextLine());

        if(num1<num2){
            System.out.println(num1+" is bigger than "+num2);
        }else{
            System.out.println(num2+" is bigger than "+num1);
        }

    }

    public void task6(){

        int num1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num1 = Integer.parseInt(sc.nextLine());

        int num2 = num1 %2;

        switch (num2){
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
        }

    }
    public void task7(){
        int num1;
        int num2;
        int num3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a Number: ");
        num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a Number: ");
        num3 = Integer.parseInt(sc.nextLine());

        if(num1<num2&&num2<num3){
            System.out.println(num1+", "+num2+", "+num3);
        }else if(num1<num3&&num3<num2){
            System.out.println(num1+", "+num3+", "+num2);
        }else if(num2<num1&&num1<num3){
            System.out.println(num2+", "+num1+", "+num3);
        }else if (num2<num3&&num3<num1){
            System.out.println(num2+", "+num3+", "+num1);
        }else if (num3<num1&&num1<num2) {
            System.out.println(num3 + ", "+num1+", "+num2);
        }else if (num3<num2&&num2<num1){
            System.out.println(num3+", "+num2+", "+num1);
        }
    }
}
