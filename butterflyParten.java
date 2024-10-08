import java.util.Scanner;

public class butterflyParten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // according to me
        //   // first Part
        // for(int i=0;i<=n;i++){
          
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");

        //     }
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // seceond part
        // for(int i=n;i>=0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");

        //     }
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // acording to youtube
        // first part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space =2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second part
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space =2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
