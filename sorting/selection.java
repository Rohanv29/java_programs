package sorting;

public class selection {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        for(int i=0;i<arr.length;i++){
            int minidx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
             int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
        print(arr);
    }
}
