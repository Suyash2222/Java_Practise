public class Car {

    int noOfWheels;
    int noOfDoors;
    int maxSpeed;

    String name;
    String modelNo;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNo, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNo = modelNo;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car Name: "+name+"\nCompany: "+company;
    }

    public static void main(String[] args) {
        Car swift = new Car(4,5,150,"Swift","SW478","Maruti");
        System.out.println(swift.toString());
    }
}
