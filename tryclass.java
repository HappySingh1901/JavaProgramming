import java.util.Arrays;
public class tryclass {
    public static void main(String[] args) {
        /*int num=123;
        String s=Integer.toString(num);
        System.out.println(s.getClass());  
        System.out.println(s);
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            System.out.print(s.charAt(i)); 
        }
        String st="Happy";
        System.out.println(st.charAt(2));*/

        /*System.out.println(String.valueOf(num));     //This can also be used instead of toString()
        float a=1.7329f;
        System.out.printf("%.3f" , a);*/

        /*String u = "sansadeepsansa";
        String v = "sa";
        int firstIndex = u.indexOf(v);
        if (firstIndex != -1) {
            int secondIndex = u.indexOf(v, firstIndex + v.length());
            if (secondIndex != -1) {
                System.out.println("Index of the second occurrence of '" + v + "' after the first occurrence: " + secondIndex);
            } else {
                System.out.println("Second occurrence not found.");
            }
        } else {
            System.out.println("Substring not found in the string.");
        }*/

        //Selection sort
        /*int arr[]={1,25,8,3,6,5,0};
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
        }*/

        //Linear search

        /*int arr[]={1,23,4,4,5,6,7};
        int key=8;
        int n=arr.length;
        boolean bool=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                bool=true;
                System.out.println("Element found at index" + i);
                break;
            }
        }
        if(!bool){
            System.out.println("Element not found");
        }*/


        /*int arr[]={11,4,69,2,7};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }*/

        
        // int arr[][]={{11,8,3,7,3,45},{3,5,8,3,5,9}};
        // //Arrays.sort(arr);
        // for(int val[]:arr){
        //     for(int value:val){
        //         System.out.print(value + " ");
        //     }
        //     System.out.println();
        // }

        // int arr1[][]={{11,8,3,7,3,45},{3,5,8,3,5,9}};
        // //Arrays.sort(arr);
        // for(int val1[]:arr1){
        //     for(int value1:val1){
        //         System.out.print(value1 + " ");
        //     }
        //     System.out.println();
        // }
        // int arrplus[][]=new int[arr.length][arr1.length];
        // for(int plus[]:arr){
        //     for(int plus1[]:arr1){
        //         for(int i=0;i<arr.length)

        //     }
        // }
        
                int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                };
        
                int[][] matrix2 = {
                    {9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}
                };
        
                int[][] sum = addMatrices(matrix1, matrix2);
                displayMatrix(sum);
            }
        
            public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
                int rows = matrix1.length;
                System.out.println(rows + "hi");
                int cols = matrix1[0].length;
                int[][] result = new int[rows][cols];
                
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                
                return result;
            }
        
            public static void displayMatrix(int[][] matrix) {
                System.out.println("Sum of the matrices:");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            
        
        



    }
}
