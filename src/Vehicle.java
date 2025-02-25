import java.time.LocalDate;

public class Vehicle {
    String license_plate;
    String brand;
    Integer year;
    String fuel;
    Double price;
    Boolean ac;
    LocalDate hun_license;
    
    public Vehicle(String license_plate, String brand, Integer year, String fuel, Double price, Boolean ac,
            LocalDate hun_license) {
        this.license_plate = license_plate;
        this.brand = brand;
        this.year = year;
        this.fuel = fuel;
        this.price = price;
        this.ac = ac;
        this.hun_license = hun_license;
    }

    
}
/*Az alábbi állományban járműveik adatait láthatjuk,
a következő oszlopok szerint: rendszám, márka, évjárat, üzemanyag, eladási ár, 
klíma, magyar forgalmi érvényessége. */
