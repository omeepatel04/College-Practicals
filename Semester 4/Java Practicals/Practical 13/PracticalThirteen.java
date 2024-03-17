import java.util.Scanner;

class PracticalThirteen {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String S1 = scan.nextLine();

        System.out.println("Lenght of String: " + S1.length());
        System.out.println("Character at Index 2: " + S1.charAt(2));
        System.out.println("Does String contain m: " + S1.contains("m"));
        System.out.println(String.format("This a formatted string: %s", S1));
        


        String[] splitted = S1.split("m");
        System.out.println("Split String: ");
        for(String iterator: splitted){
            System.out.println(iterator);
        }
        }
}