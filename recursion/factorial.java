package recursion;

public class factorial {
    public static void main(String[] args) {
        int n = 5;

        // Functional Recursion
        System.out.println("Factorial using Functional Recursion:");
        int ans = fact1(n);
        System.out.println(ans);

        // Parameterized Recursion
        System.out.println("\nFactorial using Parameterized Recursion:");
        fact2(n, 1);
    }

    // Functional Recursion
    static int fact1(int n) {
        if (n == 1)
            return 1;
        return n * fact1(n - 1);
    }

    // Parameterized Recursion
    static void fact2(int i, int product) {
        if (i < 1) {
            System.out.println(product);
            return;
        }
        fact2(i - 1, product * i);
    }
}
