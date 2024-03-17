import java.util.Scanner;

class PracticalTwo {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        
        int a, b, c;

        System.out.println("Enter the value of a: ");
        a = scan.nextInt();

        System.out.println("Enter the value of b: ");
        b = scan.nextInt();

        System.out.println("Enter the value of c: ");
        c = scan.nextInt();

        // ternaryMax(a, b, c);

        // Only for practice

        // relationalMax(a, b, c);




        isOddEven(a);
        isOddEven(b);
        isOddEven(c);


        // Using Comparison Operators


    }

    // public static void ternaryMax(int a, int b, int c){
    //     System.out.println(a==b && b==c ? "All are equal!" : a>b ? (a>c ? (a + "is Maximum.") : (c + " is Maximum.")) : (b>c ? (b + " is Maximum.") : (c + " is Maximum.")));
    // }

    // Only for practice

    // public static void relationalMax(int a, int b, int c){
    //     if(a == b && b == c){
    //         System.out.println("All are equal!");
    //     } else {
    //         if(a > b){
    //             if(a > c){
    //                 System.out.println("Maximum of three: " + a);
    //             } else {
    //                 System.out.println("Maximum of three: " + c);
    //             }
    //         } else {
    //             if(b > c){
    //                 System.out.println("Maximum of three: " + b);
    //             } else {
    //                 System.out.println("Maximum of three: " + c);
    //             }
    //         }   
    //     }
    // }


    public static void isOddEven(int num){
        if(num%2==0){
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}