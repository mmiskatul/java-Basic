import java.util.Scanner;
public class eventhenSortArray {
    static int [] Arraypreroti(int arr[]){
        int n=arr.length;
        int left=0,rig=n-1;
        while(left<rig){
            if(arr[left]%2==1 && arr[rig]%2==0){
                int temp=arr[left];
                arr[left]=arr[rig];
                arr[rig]=temp;
                left++;
                rig--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[rig]%2==1){
                rig--;
            }
        }
        return arr;
    }
    static int [] input(int n){
        int arr[]=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int arr[]= input(n);
       int l[]=Arraypreroti(arr);
        printArray(l);
    }
}
