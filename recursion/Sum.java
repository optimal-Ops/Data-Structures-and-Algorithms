package recursion;

public class Sum {
    public static void main(String[] args) {
        int n = 10;

        // Functional Recursion
        System.out.println("Sum using Functional Recursion:");
        int ans = functionalSum(n);
        System.out.println(ans);

        // Parameterized Recursion
        System.out.println("\nSum using Parameterized Recursion:");
        parameterizedSum(n, 0);
    }

    // Functional Recursion
    static int functionalSum(int n) {
        if (n == 1)
            return 1;
        return n + functionalSum(n - 1);
    }

    // Parameterized Recursion
    static void parameterizedSum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        parameterizedSum(i - 1, sum + i);
    }
}
