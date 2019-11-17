public class Saab95Garage extends AbstractGarage{

    public Saab95Garage(){
        super();
        maxVehicles = 10;
    }

    /**
     * @param saab95 Adds vehicle to garage list
     */
    public void addVehicle(Saab95 saab95){
        super.addVehicle(saab95);
    }

    /**
     * @param saab95 Removes vehicle from garage list
     * @return
     */
    public Saab95 removeVehicle(Saab95 saab95){
        return (Saab95) super.removeVehicle(saab95);
    }
}
