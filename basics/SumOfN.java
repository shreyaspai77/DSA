import java.util.Scanner;

public class SumOfN {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=nSum(n);
        System.out.println(sum);
    }
    static int nSum(int n){
        if(n==1)
            return 1;
        else{
            return n+nSum(n-1);
        }
    }
}