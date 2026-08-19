interface Shape{
    public double getArea();
}
class Triangle implements Shape{
    double height;
    double base;
    Triangle(double height, double base){
        this.height=height;
        this.base=base;
    }
    public double getArea(){
        return 0.5*base*height;
    }
}
class Square implements Shape {

    double side;

    Square(double side) {
        this.side=side;
    }

    public double getArea() {
        return side*side;
    }
}
class Main3{
    public static void main(String[] args) {
        Triangle t=new Triangle(4,5);
        System.out.println("Area of triangle: "+t.getArea());
        Square s=new Square(6);
        System.out.println("Area of square: "+s.getArea());
    }
}