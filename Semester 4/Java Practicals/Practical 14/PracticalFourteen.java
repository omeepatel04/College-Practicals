class Numbers {
    int a = 10, b = 20;
}

class AddNumbers extends Numbers{
    void addNumbers(int num1, int num2){
        System.out.println("Added Numbers: " + (num1 + num2));
    }
}

class PracticalFourteen {
    public static void main(String args[]){
    AddNumbers a1 = new AddNumbers();

    a1.addNumbers(a1.a, a1.b);
    }
}