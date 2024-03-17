class ValueAssignment {
    int x = 5;

    ValueAssignment(){
        System.out.println("No Argument Constructor Invoked.");
    }

    ValueAssignment(int a){
        System.out.println("Parameterized Constructor Invoked.");
        x = a;
    }



}

class PracticalTwelve{
    public static void main(String args[]){

        ValueAssignment v1 = new ValueAssignment();
        ValueAssignment v2 = new ValueAssignment(2);

        System.out.println("The value of x in no argument constructor: " + v1.x);
        System.out.println("The value of x in parameterized constructor: " + v2.x);
    }
}