import java.util.ArrayList;
import java.util.List;

public class AbstractGarage implements IGarage{

    final List<AbstractVehicle> listVehicles;

    int maxVehicles;

    public AbstractGarage(){
        listVehicles = new ArrayList<>();
    }

    public void addVehicle(AbstractVehicle vehicle){
        if(listVehicles.size() < maxVehicles){
            listVehicles.add(vehicle);
        }
    }

    public AbstractVehicle removeVehicle(AbstractVehicle vehicle){
        if(!listVehicles.isEmpty() && listVehicles.contains(vehicle)){
            return listVehicles.remove(listVehicles.indexOf(vehicle));
        }
        return null;
    }


}
