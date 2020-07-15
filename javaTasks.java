
import java.util.Scanner;


public class javaTasks {
    public static void main(String[] args) {

        checkPositiveOrNegative(); // TASK 1
        changeNumberToDayOfWeek(); //TASK 2
        isTheYearIsLeap(); // TASK 4
        checkIfCharacterIsVowel();


    }

    private static void checkIfCharacterIsVowel() {

        char character;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an Character in console: ");
        character = console.next().charAt(0);
        if ( character=='a' || character=='A' || character=='E' || character=='e'
                || character=='i' || character=='I' || character=='o' || character=='O'
                || character=='u' || character=='U') {
            System.out.println("This is a Vowel that you want Dude!!");
        } else {
            System.out.println("This is not Vowel - BURN!!!");
        }
    }

    private static void isTheYearIsLeap() {

        int year;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = console.nextInt();

        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }


    private static void changeNumberToDayOfWeek() {

        int numberToDayOfWeek;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number: ");
        numberToDayOfWeek = console.nextInt();

        switch (numberToDayOfWeek) {
            case 1:
                System.out.println("Понеделник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Сряда");
                break;
            case 4:
                System.out.println("Четвъртък");
                break;
            case 5:
                System.out.println("Петък");
                break;
            case 6:
                System.out.println("Събота");
                break;
            case 7:
                System.out.println("Неделя");
                break;
            default:
                System.out.println("Не познаваш дните");
        }

        private static void checkPositiveOrNegative () {
            int number;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number you want to check:");
            number = scan.nextInt();
            scan.close();
            if (number > 0) {
                System.out.println(number + " is positive number");
            } else if (number < 0) {
                System.out.println(number + " is negative number");
            } else {
                System.out.println(number + " is positive too");
            }
        }
    }
}