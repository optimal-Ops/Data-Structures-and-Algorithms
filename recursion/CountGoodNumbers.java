package recursion;

public class CountGoodNumbers{
     static final int mod = 1000000007;// to avoid overflow
    public static void main(String[] args) {
        int ans1=cgn(4);
        System.out.println("for 4: "+ans1);


        int ans2=cgn(50);
        System.out.println("for 50: "+ans2);

        int ans3=cgn(1000);
        System.out.println("for 1000: "+ans3);
    }
    static int cgn(long n) {

        long even = n / 2 + n % 2;//even positions
        long odd = n / 2;//odd positions
        long res1 = pow(5, even);
        long res2 = pow(4, odd);

        return (int) ((res1 * res2) % mod);
    }

    static long pow(long x, long n) {
        long result = 1;
        x = x % mod;// to avoid overflow
        while (n > 0) {

            if (n % 2 == 1) { 
        // If n is odd, we need to multiply by x once more.This is because for even exponents, x^n = (x^(n/2))^2.
        // For odd exponents, x^n = x * (x^(n/2))^2, 
        // so we multiply the result by x after squaring the half-exponent result.
                result = (result * x) % mod;
            }
            x = (x * x) % mod;
            n /= 2;
        }
        return result;
    }
    
}
//tc=O(log n)
//sc=O(1)