public class Car {
    private String carModel;
    private String carBrand;
    private int carYear;
    private String carMileage;

    private String carDetails(){
        return String.format("My %s %s is a %d with %s miles.",
                carBrand,
                carModel,
                carYear,
                carMileage);
    }
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.carModel = "Outback";
        myCar.carBrand = "Subaru";
        myCar.carYear = 2010;
        myCar.carMileage = "140,000";
        System.out.println(myCar.carDetails());
    }
}
