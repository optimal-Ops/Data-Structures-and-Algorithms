package recursion;
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        double base=sc.nextDouble();
        System.out.println("enter the exponet: ");
        int exp=sc.nextInt();
        sc.close();
        
        double ans=myPow(base,exp);
        System.out.println("by iteration: "+ans);
        double res= recursionPow(base, exp);
        System.out.println("by recursion: "+res);
       
    }
    static double myPow(double x, int n) {
        if (n == 0) return 1.0;

        // Convert n to long to handle Integer.MIN_VALUE.
        // If n is -2147483648  making it positive would result in 2147483648, which cannot fit in an int.

        long exp = n;
        if (exp < 0) {//for negative value of n
            x = 1 / x; 
        }

        double result = 1.0;
        for (long i = 0; i < exp; i++) {
            result *= x; 
        }

        return result;
    }   
    //TC=O(n)
    //sc=O(1)
    static double recursionPow(double x, int n) {
        if (n == 0) return 1.0;


        long exp = n;
        if (exp < 0) {//for negative value of n
            x = 1 / x; 
        }

        double result = recursionPow(x, (int)exp/2);
        if(exp%2==0){
            return result*result;
        }else{
            return x*result*result;
        }
        

       
    }   
}
// Time complexity:O(log n) ==>we divide n by 2 in each step(n is divided by 2 when it is even and when it is odd it reduce by one which makes even number in the next step)
//sc==O(log n) (stack operation)