public class Tanker extends Vehicles implements CarriesCargo {
    String name = "Танкер";
    Propeller propeller = new Propeller();

       String description = Vehicles.name + " " + name + " имеет " + propeller.name + " и " + CarryGoods();;

}
