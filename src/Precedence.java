public class Precedence {
    public static void main(String[] args)
    {
        // Operator precedence and Associativity Rules

        // Priority wise list :
        // 1. ++,-- : pre,post
        // 2. *,/,% : left to right
        // 3. +,- : left to right
        // 4.
        // 5.
        //   ==,!= : left to right

        int x = 4, y = 2, z = 3;
        int ans;
        ans = ++x*y++/z;
        // 5 * 3 / 3 = 15/3 = 5
        // 5 * 2 / 3 = 10/3 = 3
        System.out.println(ans);
        ans = ++x*y--; //5
        System.out.println(y);
        System.out.println(ans);
        ans = ++x*z/y; // 7
        System.out.println(ans);
        ans = x+y-z*x/x;
        // z*x = 12
        // 12/x = 3
        // 3+4 = 7
        // 7-z = 4
        System.out.println(ans);

        boolean p = false;
        boolean q = false;
        boolean r = true;
        // left to right
        // p==q = true
        // true==r = true
        // false==true = false
        System.out.println(p==q==r);
        // p!=q = false
        // false==r = false
        System.out.println(p!=q==r);

    }
}
