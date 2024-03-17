class Rectangle {
    double height, width;

    Rectangle(double h, double w){
        height = h;
        width = w;
    }

    void rectArea(){
        System.out.println("Rectangle Area: " + height*width);
    }
}


class PracticalSeven {
     public static void main(String args[]){
        Rectangle rect = new Rectangle(2.5, 2.5);
        rect.rectArea();
     }
}