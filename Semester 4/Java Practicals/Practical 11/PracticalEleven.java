class Shape{
    void area(float radius){
        System.out.println("Circle's Area: " +  (3.14*radius*radius));
    }

    void area(float length, float width){
        System.out.println("Rectangle's Area: " + (length*width));
    }


}

class PracticalEleven {
    public static void main(String args[]){
        Shape s1 = new Shape();
        s1.area(5);
        Shape s2 = new Shape();
        s2.area(2, 5);
    }
}