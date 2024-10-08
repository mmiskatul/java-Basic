import java.util.Scanner;

public class solidRombos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int space =n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){

                // for holl
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                // System.out.print("*");
            }
            System.out.println();
        }
    }
}
