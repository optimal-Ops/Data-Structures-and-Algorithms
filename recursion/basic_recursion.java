package recursion;

import java.util.Scanner;
//1.Print HELLO n times
public class basic_recursion {
    public static void main(String[] args) {
        System.out.println("enter value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close(); // Close the scanner to avoid resource leaks
        recursion(1,n);
    }
    static void recursion(int i,int n){
        if(i>n)
        return;
        System.out.println("HELLO!");
        recursion(i+1, n);
    }
}
//2.Print  from 1 to n
public class basic_recursion {
    public static void main(String[] args) {
        System.out.println("enter value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         sc.close();
        recursion(1,n);
    }
    static void recursion(int i,int n){
        if(i>n)
        return;
        System.out.println(i);
        recursion(i+1, n);
    }
}


//3.Print from n to 1

public class basic_recursion {
    public static void main(String[] args) {
        System.out.println("enter value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         sc.close();
        recursion(n,n);
    }
    static void recursion(int i,int n){
        if(i<1)
        return;
        System.out.println(i);
        recursion(i-1, n);
    }
}
//4.print from 1 to n by backtracking

public class basic_recursion {
    public static void main(String[] args) {
        System.out.println("enter value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         sc.close();
        recursion(n,n);
    }
    static void recursion(int i,int n){
        if(i<1)
        return;
        recursion(i-1, n);
         System.out.println(i);
    }
}

//5.print n to 1 by backtracking

public class basic_recursion {
    public static void main(String[] args) {
        System.out.println("enter value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        recursion(1,n);
    }
    static void recursion(int i,int n){
        if(i>n)
        return;
        recursion(i+1, n);
         System.out.println(i);
    }
}