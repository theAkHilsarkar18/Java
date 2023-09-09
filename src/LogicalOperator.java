
public class LogicalOperator {
    public static void main(String[] args) {
        short x = 10, y = 20, z = 10;
        System.out.println((x == y) || (x == z));
        System.out.println((x > y) && (y >= x));
        System.out.println(x != y);
        System.out.println(x == z);
    }
}
