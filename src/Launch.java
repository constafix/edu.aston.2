public class Launch extends Vehicles implements CarriesCargo {
    String name = "Катер";
    Propeller propeller = new Propeller();

    String description = Vehicles.name + " " + name + " имеет " + propeller.name + " и " + CarryGoods();

}
