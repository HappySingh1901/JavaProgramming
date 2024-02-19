public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,25,8,3,6,5,0};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int smallno=arr[index];
            arr[index]=arr[i];
            arr[i]=smallno;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +  " ");
        }
    }
}
