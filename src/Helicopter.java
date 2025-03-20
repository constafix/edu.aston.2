public class Helicopter extends Vehicles implements CarriesCargo {
    String name = "Вертолёт";

    Wheels wheels = new Wheels();
    Propeller propeller = new Propeller();

    String description = Vehicles.name + " " + name + " имеет " + wheels.name + ", " + propeller.name + " и " + CarryGoods();

}
