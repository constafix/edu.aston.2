public class Taxi extends Vehicles {
    String name = "Такси";
    Wheels wheels = new Wheels();

    String description = Vehicles.name + " "+ name + " имеет " + wheels.name;
}
