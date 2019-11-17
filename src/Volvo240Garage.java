public class Volvo240Garage extends AbstractGarage{

    public Volvo240Garage(){
        super();
        maxVehicles = 5;
    }

    /**
     * @param volvo240 Adds vehicle to garage list
     */
    public void addVehicle(Volvo240 volvo240){
        super.addVehicle(volvo240);
    }

    /**
     * @param volvo240 Removes vehicle from garage list
     * @return
     */
    public Volvo240 removeVehicle(Volvo240 volvo240){
        return (Volvo240) super.removeVehicle(volvo240);
    }
}
