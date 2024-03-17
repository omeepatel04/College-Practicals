import java.util.Scanner;

class PracticalFour{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];

        for(int i = 0; i < 3; i++){
            System.out.println("Enter M1 Row " + (i+1) + ": ");
            for(int j = 0; j < 3; j++){
                System.out.println("Enter Row " + (i+1) + " Element " + (j+1) + ": ");
                arr1[i][j] = scan.nextInt();
            }
        }

        
        for(int i = 0; i < 3; i++){
            System.out.println("Enter M2 Row " + (i+1) + ": ");
            for(int j = 0; j < 3; j++){
                System.out.println("Enter Row " + (i+1) + " Element " + (j+1) + ": ");
                arr2[i][j] = scan.nextInt();
            }
        }


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j]; 
            }
        }
    

        for(int i = 0; i < 3; i++){
            System.out.println("New Array Row " + (i+1) + ": ");
            for(int j = 0; j < 3; j++){
                System.out.println("Row " + (i+1) + " Element " + (j+1) + ": " + arr3[i][j]);
            }
        }
    }
}