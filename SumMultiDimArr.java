public class SumMultiDimArr {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8}};
        int arr2[][]={{9,10,11,12},{13,14,15,16}};
        int rows=arr.length;
        int cols=arr[0].length;
        int sum[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
