import java.util.Scanner;

public class PrintGFGntimes {
    static void printGfg(int N) {
        // code here
        if(N==1)
        {System.out.print("GFG ");
            return;
        }

        printGfg(N-1);
        System.out.print("GFG ");


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();
        while(t-->0)
        {
            int n=s.nextInt();
            printGfg(n);
        }

    }
}
