public class Precedence {
    public static void main(String[] args)
    {
        int x = 4, y = 2, z = 3;
        int ans;
        ans = ++x*z/y; // 7
        System.out.println(ans);
        ans = x+y-z*x/x;
        // approach - 1
        // z*x = 12
        // 12/x = 4
        // 4+x = 8
        // 8-z = 5
        System.out.println(ans);

    }
}
