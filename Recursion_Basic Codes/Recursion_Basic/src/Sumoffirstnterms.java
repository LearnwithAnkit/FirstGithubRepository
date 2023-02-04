import java.util.Scanner;

public class Sumoffirstnterms {
    static long sumOfSeries(long N) {
        // code here
        if(N==1)
        {
            return (long)N;
        }
        long val=(long)N;
        return val*val*val+sumOfSeries(N-1);
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();
        while(t-->0)
        {
            int n=s.nextInt();
            long ans=sumOfSeries(n);
            System.out.print(ans+" ");
        }
    }
}
