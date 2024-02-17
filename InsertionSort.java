public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={1,25,8,3,6,5,0};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        for(int k=0;k<n;k++){
            System.out.print(arr[k] +  " ");
        }
        System.out.println();
        }

    }
}
