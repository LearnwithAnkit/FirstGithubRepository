import java.util.Scanner;

public class PrintNto1withoutloop {
    static void printNos(int N) {
        // code here
        if (N == 1) {
            System.out.print(N + " ");
            return;
        }
        System.out.print(N + " ");
        printNos(N - 1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();
        while(t-->0)
        {
            int n=s.nextInt();
            printNos(n);
        }
    }
}
