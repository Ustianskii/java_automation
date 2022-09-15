package fizz;
import java.util.Scanner;

public class fizz {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        if (value % 15 == 0){
            System.out.println("fizz-buzz");
        } else if (value % 5 == 0){
            System.out.println("buzz");
        } else if (value % 3 == 0){
            System.out.println("fizz");
        }
    }
}
