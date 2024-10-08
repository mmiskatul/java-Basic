import java.util.Scanner;
public class secondMax{
    static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return  max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=findMax(arr);   
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                max=Integer.MIN_VALUE;
            }   
        }
        int secMax=findMax(arr);
        System.out.println(max);
    }
}