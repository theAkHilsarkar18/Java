import java.sql.SQLOutput;
import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        // byte = 120
        // short = 32000
        // int = 2*10
        // long = 9*19

        // variable : used to store value.
        // datatype variableName; // declaration.
        // datatype variableName = value; // initialization.

        // 121
        byte num1 = 121;
        System.out.println(1234);
        System.out.println(num1);
        // 10999
        short num2 = 10999;
        System.out.println(num2);
        // 35000 salary
        int salary_of_me = 35000;
        System.out.println(salary_of_me);
        //9825486060
        long phone = 9825486060L;
        System.out.println(phone);
        // float = per = 98.52
        float percentageOfDarshan = 98.52f;
        // double 456123.123123
        double random = 456123.456123;
        System.out.println(random);
        // Boolean , boolean = true , false
        boolean isLogin = true;
        System.out.println(isLogin);
        // String
        String name = "A";
        System.out.println(name);


        // to user input in java

        // object-oriented programming language

        // class - object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of num1 : ");
        num1 = input.nextByte(); // user input in byte num1 variable
        System.out.println("Enter your salary : ");
        salary_of_me = input.nextInt();

        // single word
        name = input.next(); // word
        name = input.nextLine(); // sentence

        



    }
}
