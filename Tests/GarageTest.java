import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {

    Volvo240Garage volvo240Garage;
    Saab95Garage saab95Garage;
    GenericGarage genericGarage;

    public GarageTest(){
        volvo240Garage = new Volvo240Garage();
        saab95Garage = new Saab95Garage();
        genericGarage = new GenericGarage();
    }

    @Test
    void addVehicle() {
        assertEquals(0, volvo240Garage.listVehicles.size());
        volvo240Garage.addVehicle(new Volvo240());
        assertEquals(1, volvo240Garage.listVehicles.size());

        assertEquals(0, saab95Garage.listVehicles.size());
        saab95Garage.addVehicle(new Volvo240());
        assertEquals(1, saab95Garage.listVehicles.size());
        
        assertEquals(0, genericGarage.listVehicles.size());
        genericGarage.addVehicle(new Volvo240());
        assertEquals(1, genericGarage.listVehicles.size());
    }

    @Test
    void removeVehicle() {
        Volvo240 volvo = new Volvo240();
        volvo240Garage.addVehicle(volvo);
        Volvo240 vehicle = volvo240Garage.removeVehicle(volvo);
        assertEquals(Volvo240.class, vehicle.getClass());

        Saab95 saab = new Saab95();
        saab95Garage.addVehicle(saab);
        Saab95 vehicle2 = saab95Garage.removeVehicle(saab);
        assertEquals(Saab95.class, vehicle2.getClass());


    }
}