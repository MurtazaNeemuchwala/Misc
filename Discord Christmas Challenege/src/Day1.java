import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        //Get input (name) from user and display: Merry Christmas (name)
        Scanner myScanner = new Scanner(System.in);
        System.out.print("What is your name?:");
        String inputString = myScanner.nextLine();

        System.out.println("Merry Christmas "+inputString+"!");
    }
}
