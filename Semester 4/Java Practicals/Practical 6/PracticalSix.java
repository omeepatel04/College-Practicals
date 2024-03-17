import java.util.Scanner;

class Student {
    int enrollment;
    String name;

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Enrollment: " + enrollment);
    }
}


class PracticalSix{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        

        // Using Compile Time Values
        Student studentOne = new Student();
        studentOne.name = "Om Patel";
        studentOne.enrollment = 107;  


        // Using Run Time Values
        Student studentTwo = new Student();
        System.out.println("Enter Your Name: ");
        studentTwo.name = scan.nextLine();
        System.out.println("Enter Your Enrollment Number: ");
        studentTwo.enrollment = scan.nextInt();

        studentOne.display();
        studentTwo.display();
    }
}


