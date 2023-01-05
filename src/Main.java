
abstract class Vehicle{
    abstract int getSpeed();
    abstract int getCubicCapacity();
}

class Car extends Vehicle{
    int getSpeed(){ return 100;}
    int getCubicCapacity(){return 1900;}
    boolean sHatchBack() {return true;}
}

class Bus extends Vehicle{
    int getSpeed(){ return 100;}
    int getCubicCapacity(){ return 1900;}
    String getEmergencyExitLoc(){ return "Front";}
}

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();
        vehicle = new Car();
        vehicle.getCubicCapacity();
    }
}
