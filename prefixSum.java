import java.util.Scanner;
public class prefixSum {
    static void prefixSum(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the index :");
        int target=sc.nextInt();
        int sum=0;
        for(int i=0;i<=target;i++){
            sum+=arr[i];
        }
        arr[target]=sum;
        printArray(arr);
    }
    static void input(int n) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
       prefixSum(arr);
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        input(n);
    }
}
