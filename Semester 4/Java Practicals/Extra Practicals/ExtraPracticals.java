import java.util.Scanner;

class ExtraPracticals{



    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        // String Sorting 

        String myString = "Hello World!";
        char[] charArray = myString.toCharArray();
        int n = charArray.length;


        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (charArray[j] > charArray[j + 1]) { 
                    char temp = charArray[j]; 
                    charArray[j] = charArray[j + 1]; 
                    charArray[j + 1] = temp; 
                }
    
        String sortedString = new String(charArray);
        System.out.println(sortedString);





        // String Extra Practicals

        // String S3 = args[0];
        // String S1 = new String("My World!");
        // String S2 = "My World!";

        // System.out.println("This is a substring: " + S1.substring(1, 4));
        // System.out.println("Index of W: " + S1.indexOf("W"));
        // System.out.println("String in uppercase: " + S1.toUpperCase()); 
        // System.out.println("String in lowercase: " + S1.toLowerCase());
        // System.out.println("Trimmed String: " + S1.trim());
        // System.out.println("S1 is equal to S2: " + S1.equals(S2));
        // System.out.println("S1 is equal to S2: " + S1.compareTo(S2));
        // System.out.println("Unicode of index 2 : " + S1.codePointAt(2));
        // System.out.println("Unicode of index 1 : " + S1.codePointBefore(2));
        // System.out.println("Number of Unicode values in S1: " + S1.codePointCount(0, 5));
        // System.out.println("S1 + S2: " + S1.concat(S2));
        // System.out.println("First character of S1 is M: " + S1.startsWith("M"));
        // System.out.println("Last character of S1 is !: " + S1.endsWith("!"));
        // System.out.println("Spaced replaced S1: " + S1.replace(" ", "*"));  




        // Add Numbers From Command Line Input

        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);

        // System.out.println("a + b = " + (a+b));


        // Multiplication of Matrix

        // int[][] arr1 = new int[3][3];
        // int[][] arr2 = new int[3][3];
        // int[][] arr3 = new int[3][3];

        // for(int i = 0; i < 3; i++){
        //     System.out.println("Enter M1 Row " + (i+1) + ": ");
        //     for(int j = 0; j < 3; j++){
        //         System.out.println("Enter Row " + (i+1) + " Element " + (j+1) + ": ");
        //         arr1[i][j] = scan.nextInt();
        //     }
        // }

        
        // for(int i = 0; i < 3; i++){
        //     System.out.println("Enter M2 Row " + (i+1) + ": ");
        //     for(int j = 0; j < 3; j++){
        //         System.out.println("Enter Row " + (i+1) + " Element " + (j+1) + ": ");
        //         arr2[i][j] = scan.nextInt();
        //     }
        // }


        // for(int i = 0; i < 3; i++){
        //     for(int j = 0; j < 3; j++){
        //         arr3[i][j] = (arr1[i][j] * arr2[j][i]) + (arr1[i][j] * arr2[j][i]) + (arr1[i][j] * arr2[j][i]);
        //     }
        // }
    

        // for(int i = 0; i < 3; i++){
        //     System.out.println("New Array Row " + (i+1) + ": ");
        //     for(int j = 0; j < 3; j++){
        //         System.out.println("Row " + (i+1) + " Element " + (j+1) + ": " + arr3[i][j]);
        //     }
        // }
    }
}