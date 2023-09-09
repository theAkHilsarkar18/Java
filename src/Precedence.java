public class Precedence {
    public static void main(String[] args)
    {
        int x = 4, y = 2, z = 3;
        int ans;
        ans = ++x*z/y; // 7
        System.out.println(ans);
        ans = x+y-z*x/x;
        // z*x = 12
        // 12/x = 3
        // 3+4 = 7
        // 7-z = 4
        System.out.println(ans);


    }
}
