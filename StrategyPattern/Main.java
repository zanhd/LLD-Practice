import DriveStrategy.NormalDriveStrategy;
import DriveStrategy.SportDriveStrategy;
import Vehicles.Types.NormalVehicle;
import Vehicles.Types.OffRoadVehicle;
import Vehicles.Types.SportVehicle;
import Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("[STRATEGY-PATTERN]");

        Vehicle normalVehicle = new NormalVehicle(new NormalDriveStrategy());
        Vehicle sportVehicle = new SportVehicle(new SportDriveStrategy());
        Vehicle offRoadVehicle = new OffRoadVehicle(new SportDriveStrategy());

        normalVehicle.drive();
        sportVehicle.drive();
        offRoadVehicle.drive();
    }
}
