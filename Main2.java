interface Vehicle{
    public void changGear(int a);
    public void speedUp(int a);
    public void applyBrakes(int a);
}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    public void changGear(int newgear){
        gear=newgear;
    }
    public void speedUp(int increment){
        speed=speed+increment;
    }
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    public void printStates(){
        System.out.println("Speed:"+speed+" Gear:"+gear);
    }
}
class Car implements Vehicle{
    int speed;
    int gear;
    public void changGear(int newgear) {
        gear = newgear;
    }
    public void speedUp(int increment) {
        speed = speed + increment;
    }
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed:" + speed + " Gear:" + gear);
    }
}
class Main2{
    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle();
        bicycle.changGear(4);
        bicycle.speedUp(3);
        bicycle.applyBrakes(2);
        System.out.println("The current state of the bicycle is:");
        bicycle.printStates();
        Car car = new Car();
        car.changGear(4);
        car.speedUp(3);
        car.applyBrakes(2);
        System.out.println("The current state of the car is:");
        car.printStates();
    }
}