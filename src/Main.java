public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();
        Launch launch = new Launch();
        Tanker tanker = new Tanker();
        Truck truck = new Truck();
        Taxi taxi = new Taxi();

        System.out.println(airplane.description);
        System.out.println(helicopter.description);
        System.out.println(launch.description);
        System.out.println(tanker.description);
        System.out.println(truck.description);
        System.out.println(taxi.description);
    }
}
