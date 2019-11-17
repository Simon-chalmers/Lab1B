
public class Ferry extends AbstractVehicle implements ILoadable {

    Loadable loadable;

    public Ferry(){
        loadable = new Loadable(150);
    }

    @Override
    public void addItem(Load load) {
        loadable.addItem(load);
    }

    @Override
    public Load removeItem(Load load) {
        return loadable.removeItem(load);
    }

    @Override
    double speedFactor() {
        return enginePower * 0.01;
    }
}
