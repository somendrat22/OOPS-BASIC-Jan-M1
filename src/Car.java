public class Car {
    int wheels;
    int seats;
    int regNumber;

    Car(){
        System.out.println("Hii");
    }
    Car(int wheels, int seats, int regNumber){
        this.wheels = wheels;
        this.seats = seats;
        this.regNumber = regNumber;
    }

    public void acclerate(){
        System.out.println("Car is running");
    }

    public void stop(){
        System.out.println("Car got stopped");
    }

}
