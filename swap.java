import java.util.Scanner;
public class swap {
    static int []sawpwithoutemp(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        int ans[]={a,b};
        return ans;
    }
    static int[] sawpwithTemp(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        int ans[]={a,b};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a :");
        int a=sc.nextInt();
        System.out.println();
        System.out.print("b: ");
        int b=sc.nextInt();
        // int value[]=sawpwithTemp(a, b);
      int  value[]=sawpwithoutemp(a, b);
        System.out.println("after sawp \na: "+value[0]+"\nb :"+value[1]);
        
        

    }
}
