import java.util.Scanner;

public class Operator {

    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String fname = input.next();
        System.out.print("Enter your last name : ");
        String name = input.nextLine();
        name = input.nextLine();
        System.out.println(name);
    }


}
