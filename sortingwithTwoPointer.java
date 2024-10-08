public class sortingwithTwoPointer {
    public static void main(String[] args) {
        int count1=0;
        int count0=0;
        int arr[]={1,0,0,0,1,0,1,0,1};
       int i=0;
       int j=arr.length-1;
       while(i<j){
            if(arr[i]==1&&arr[j]==0){
                int temp=arr[i];
                 arr[i]=arr[j];
                arr[j]=temp;
            }
            i++;
            j--;
       }
       for( i=0;i<arr.length;i++){
        System.out.print(arr[i]);
       }
        
    }
}
