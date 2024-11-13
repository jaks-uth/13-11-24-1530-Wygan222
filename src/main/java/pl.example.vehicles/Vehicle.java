package pl.example.vehicles;

public abstract class Vehicle
{
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract int getMaxSpeed();

    String getName()
    {
        return name;
    }
}
