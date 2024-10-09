import java.util.Scanner;
public class ArrayElementSquare {
    static void square(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }
    static void input(int n) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        square(arr);
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        input(n);
    }
}
