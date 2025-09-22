import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        Petlje obj = new Petlje();
//
//        int enteredNumber = scanner.nextInt();
//
//        obj.punoletnaOsoba(enteredNumber);

//        obj.ispisNizaBrojeva(10, 20);

//        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }

        int number = 8;

        int guessNumber;



//        while (number!=guessNumber){
//            System.out.println("Enter number:");
//             guessNumber = scanner.nextInt();
//            if (number==guessNumber){
//                System.out.println("Bingo");
//            }else {
//                System.out.println("Wrong number, try again");
//            }
//
//        }

        do {
            System.out.println("Enter number:");
            guessNumber = scanner.nextInt();
            if (number==guessNumber){
                System.out.println("Bingo");
            }else {
                System.out.println("Wrong number, try again");
            }
        }while(number!=guessNumber);




























    }
















}
