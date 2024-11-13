package pl.example.vehicles;

public class TestowanieDzialania
{
    public static void main(String[] args) throws Exception {
        Car car = new Car("Audi", 4);
        Bike bike = new Bike("BMX");


        if(car.getMaxSpeed()!=200)
        {
            throw new Exception("Bledna wartosc");
        }
        if(bike.getMaxSpeed()!=50)
        {
            throw new Exception("Bledna wartosc");

        }
        if(car.getDoors()!=4)
        {
            throw new Exception("Bledna wartosc");

        }
        if(car.getName()!="Audi")
        {
            throw new Exception("Bledna wartosc");

        }
        if(bike.getName()!="BMX")
        {
            throw new Exception("Bledna wartosc");

        }
    }
}
