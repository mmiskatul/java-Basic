import java.util.Scanner;

public class Arrayrevers {
    static int[] reverseArray(int arr[]){
        int j=0;
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            ans[j++]=arr[i];
        }
       return  ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        //  arr[]={1,2,3,4,5,6,7};
        // int ans[]=reverseArray(arr);
        // for(int i=0;i<n;i++){
        //     System.out.print(ans[i]);
        // }
      
        
    }
}
