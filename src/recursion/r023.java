package recursion;

// n to 1


public class r023 {
    public static void dec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        dec(n - 1);
    }
    public static void main(String args[]) {
        int n = 5;
        dec(n);
    }
}

