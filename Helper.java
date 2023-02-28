import java.util.Scanner;
public class Helper{
    Scanner scanner = new Scanner(System.in);

    int setter(){
        System.out.print("Enter you Guess:");
        int n = scanner.nextInt();
        return n;
    }
}