import java.util.Scanner;

class PracticalThree{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Enter your number: ");
        num = scan.nextInt();
        reverse(num);
    }

    public static void reverse(int num){
        int rev = 0, rem;
        while(num!=0){
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        System.out.println("Reversed Number: " + rev);
    }

}