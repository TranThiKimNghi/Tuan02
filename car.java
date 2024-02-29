public class Car {
    private String model;
    private int year;
    public Car( String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);

        Car car2 = new Car("Honda", "Civic", 2018);

        System.out.println("Car 1: Model = " + car1.getModel() + ", Year = " + car1.getYear());
        System.out.println("Car 2: Model = " + car2.getModel() + ", Year = " + car2.getYear());
    }
}
