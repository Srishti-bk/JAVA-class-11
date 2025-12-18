// Create a class `Car` with a parameterized constructor (model, year). Print the values....
 class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[]args){
        Car car1=new Car("Toyota",2020);
    }
}



