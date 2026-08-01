
import java.util.Scanner;
class jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0 ,col1,col2,col3; 
        
        System.out.println("Enter the numebr of columns in row1");
        col1 = sc.nextInt();
        System.out.println("Enter the numebr of columns in row2");
        col2 = sc.nextInt();
        System.out.println("Enter the numebr of columns in row3");
        col3 = sc.nextInt();
        int [][]arr = new int [3][];
        for(int i =0 ; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j]=count++;
            }
        }
        
        System.out.println("Elements of jagged array are :");
        for(int k=0;k< arr.length;k++){
            for(int l = 0; l<arr[k].length;l++){
                System.out.print( arr[k][l] + " ");
            }
            System.out.println();
        }
        
        
        
        
    }
}
