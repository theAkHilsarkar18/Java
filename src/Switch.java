import java.util.Scanner;

public class Switch {
    public static void main(String[] args)
    {
        // 10 mcq


        // question 1 : answers multiple
        System.out.println("What is name of our Prime Minister ?");
        System.out.println("A: Narendra Modi");
        System.out.println("B: Rahul Gandhi");
        System.out.println("C: Mamta Benarji");
        System.out.println("D: Yogi Adityanath");

        String ans;
        Scanner input = new Scanner(System.in);
        ans = input.next();

        switch (ans) // (variable name)
        {
            case "A" -> System.out.println("Answer is True");
            case "B" -> System.out.println("Wrong Answer");
            case "a" -> System.out.println("Modi Narendra");
            case "D" -> System.out.println("Wrong Answer");
            default -> System.out.println("Enter valid answer");
            // optional
        }


    }
}
