import java.util.Scanner;
public class fristrepeatelement {
static int value(int arr[]){
    int result=-1;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                result=arr[i];
                return result;
            }
        }
    }
    return result;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=value(arr);
        if(result!=-1){
            System.out.println("the Element is :"+result);
        }
        else{
            System.out.println("there is no reapting Element");
        }
    }
}
