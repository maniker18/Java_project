package thomus_travels;

import java.util.ArrayList;

class TestDriver {
    public static void main(String[] args) {
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("Car", "Sudhagar", 101, 4200));
        drivers.add(new Driver("Bus", "Ravi", 102, 3600));
        drivers.add(new Driver("Car", "Kiran", 103, 2500));
        drivers.add(new Driver("Van", "Mani", 104, 3000));

        Travel travel = new Travel();

        // Test isCarDriver
        System.out.println("Is Car Driver: " + travel.isCarDriver(drivers.get(0)));

        // Test RetrivebyDriverId
        System.out.println(travel.RetrivebyDriverId(drivers, 101));

        // Test RetriveCountOfDriver
        System.out.println("Car drivers count: " + travel.RetriveCountOfDriver(drivers, "Car"));

        // Test retriveDriver
        ArrayList<Driver> carDrivers = travel.retriveDriver(drivers, "Car");
        System.out.println("Drivers in 'Car' category: " + carDrivers);

        // Test RetriveMaximumDistanceTravelledDriver
        Driver maxDriver = travel.RetriveMaximumDistanceTravelledDriver(drivers);
        System.out.println("Driver with max distance: " + maxDriver);
    }
}
