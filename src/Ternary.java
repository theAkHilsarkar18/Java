import java.util.Scanner;

public class Ternary {

    public static void main(String[] args)
    {
        // ternary operator : single line condition check
        // ? :
        short num;
        System.out.print("Enter the value of num : ");
        Scanner input = new Scanner(System.in);
        num = input.nextShort();
        // num = 13

        String response = (num%2==0) ? "num is even" : "num is odd";
        System.out.println(response);

//        if(num%2==0) //13%2 = 1==0
//        {
//            System.out.println("num is even");
//        }
//        else {
//            System.out.println("num is odd");
//        }

    }
}
