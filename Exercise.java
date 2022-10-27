public class Exercise {

  public static void main(String[] args) {
    System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());

    Car car1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
    Truck truck1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
    Car car2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

    System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());

    System.out.println(car1.toString());
    System.out.println(truck1.toString());
    System.out.println(car2.toString());

    car1.accelerate(50);
    truck1.transform();
    car1.doATurboBoost();
    truck1.transform();
  }
}
