public class Sum {
    public static void main(String[] args) {
        int num=10;
        int ans=recur_sum(num);
        System.out.println(ans);
    }
    static int recur_sum(int n){
        if(n<=0)
        return 0;
        if(n==1)
        return 1;
        return n+recur_sum(n-1);
    }
}
