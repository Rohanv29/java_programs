package sorting;

public class insertion {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={7,6,5,4,3,2,1,0};
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        print(arr);
    }
}
