import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    ArrayList<Vehicle> carList = new ArrayList<>();
    
    public void readFile(){
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba!");
            e.getMessage();
        }
    }

    public void tryReadFile() throws FileNotFoundException{
        File file = new File("jaribt.txt");
        try(Scanner sc = new Scanner(file)){
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] arr = line.split(":");
                Vehicle vehicle = new Vehicle();
                vehicle.license_plate = arr[0];
                vehicle.brand = arr[1];
                vehicle.year = Integer.parseInt(arr[2]);
                vehicle.fuel = arr[3];
                vehicle.price = Double.parseDouble(arr[4]);
                vehicle.ac = Boolean.parseBoolean(arr[5]);
                LocalDate.parse(arr[6]);
                
            }
        }
    }
}
