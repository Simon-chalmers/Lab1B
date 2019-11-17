public interface IGarage {

    /**
     * @param vehicle Adds vehicle to garage
     */
    void addVehicle(AbstractVehicle vehicle);

    /**
     * @param vehicle Removes vehicle from garage
     * @return
     */
    AbstractVehicle removeVehicle(AbstractVehicle vehicle);

}
