package recursion;

// 1 to n


public class r024 {
    public static void inc(int n) {
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        inc(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String args[]) {
        int n = 5;
        inc(n);
    }
}
