
import java.util.Scanner;


public class javaTasks {
    public static void main(String[] args) {

        roots(); // TASK 1
        absoluteValue(); // TASK 2
        whichBonus(); // TASK 3
        howToUseSwitch(); //  TASK 4
    }

    private static void howToUseSwitch() {
        //TASK 4
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        int a = 10;
        int b = 20;
        int sum;
        String noMoreOptions;



        switch (number) {
            case 1: sum = a + b;
                System.out.println("Result is ="+sum);
                break;
            case 2: sum = a - b;
                System.out.println("Result is ="+sum);
                break;
            case 3: sum = b - 1;
                System.out.println("Result is ="+sum);
                break;
            case 4: sum = a * b;
                System.out.println("Result is ="+sum);
                break;
            case 5: sum = a / b;
                System.out.println("Result is ="+sum);
                break;
            case 6: sum = b / a;
                System.out.println("Result is ="+sum);
                break;
            default: noMoreOptions = "Invalid choice";

                System.out.println(number + noMoreOptions);
    }

    private static void whichBonus() {

        //TASK 3
        Scanner console = new Scanner(System.in);
        int bonus = console.nextInt();
        int firstBonus = 10;
        int secondBonus = 100;
        int thirdBonus = 1000;


        String result;
        String others = null;

        switch (bonus) {
            case 0:
                others = "грешка";
                break;
            case 1:
            case 2:
            case 3:
                bonus *= firstBonus;
                break;
            case 4:
            case 5:
            case 6:
                bonus *= secondBonus;
                break;
            case 7:
            case 8:
            case 9:
                bonus *= thirdBonus;
                break;
            default:
                others = "грешка";

                System.out.println(bonus);
        }

        private static void absoluteValue () {

            // TASK 2 Abs.Value
            Scanner console = new Scanner(System.in);
            int chooseDigitNumber = console.nextInt();
            int digitNumberConstant = 21;
            int absValue = chooseDigitNumber - digitNumberConstant;
            String AbsoluteValue;

            if (chooseDigitNumber - digitNumberConstant <= 21) {
                absValue = Math.abs(absValue);
            } else if (chooseDigitNumber - digitNumberConstant > 21) {
                absValue = Math.abs(absValue * 2);
            }
            System.out.println("Absolute Value is " + Math.abs(absValue));

        }

        private static void roots () {

            //TASK 1 Roots
            double secondRoot = 0, firstRoot = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a ::");
            double a = sc.nextDouble();

            System.out.println("Enter the value of b ::");
            double b = sc.nextDouble();

            System.out.println("Enter the value of c ::");
            double c = sc.nextDouble();

            double determinant = (b * b) - (4 * a * c);
            double sqrt = Math.sqrt(determinant);

            if (determinant > 0) {
                firstRoot = (-b + sqrt) / (2 * a);
                secondRoot = (-b - sqrt) / (2 * a);
                System.out.println("Roots are :: " + firstRoot + " and " + secondRoot);
            } else if (determinant == 0) ;
            System.out.println("Root is :: " + (-b + sqrt) / (2 * a));
        }
    }
}

