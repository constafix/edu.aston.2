public class Airplane extends Vehicles implements CarriesCargo {
    static String name = "Самолёт";

    Wheels wheels = new Wheels();
    Propeller propeller = new Propeller();
    Wings wings = new Wings();

    String description = Vehicles.name + " " + name + " имеет " + wheels.name + ", " + propeller.name + "," + wings.name + " и " + CarryGoods();

}
