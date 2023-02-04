import java.util.Scanner;

public class ReverseanArray_Recursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t= s.nextInt();
        int[] arr=new int[t];
        int i=0;
        while(i<t)
        {
            arr[i]=s.nextInt();
            i++;
        }
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        if(arr.length==0)
        {
            return;
        }
        arr[arr.length-1]=arr[0];
        reverseArray(arr);
    }
}
