package bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declared and initialized variable type
        int count = 0;

        //Inputing a Scanner to receive Input from the User
        Scanner scan = new Scanner (System.in);


        //This application will prompt the User to enter a integer between 1 and 100
        System.out.println("Please enter a number between 1 and 100 ");

        //Scanner allows user to imput numbers between 1 and 100
         count = scan.nextInt();

        if (count % 2 != 0 && count < 60) {
            System.out.print("Odd");
        }
        else if (count % 2 == 0 && count >= 2 && count <= 25) {
            System.out.print("Even and less than 25");
        }
        else if (count % 2 == 0 && count >= 26 && count <= 60) {
            System.out.print("Even");
        }
        else if (count % 2 == 0 && count > 60) {
            System.out.print("Even.");
        }
        else if (count % 2 != 0 && count > 60) {
            System.out.print(count + " and Odd.");
        }





    }
}
