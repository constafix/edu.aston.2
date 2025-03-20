public class Truck extends Vehicles implements CarriesCargo {
    String name = "Грузовик";
    Wheels wheels = new Wheels();

    String description = Vehicles.name + " " + name + " имеет " + wheels.name + " и " + CarryGoods();

}
