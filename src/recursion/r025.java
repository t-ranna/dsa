package recursion;

// sum of first n natural numbers


public class r025 {
    public static int sum(int n) {
        if (n==0) {
            return 1;
        }
        int fn1 = sum(n-1);
        int fn = n + sum(n-1);
        return fn;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(sum(n));
    }
}
