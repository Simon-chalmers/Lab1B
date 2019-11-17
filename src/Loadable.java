import java.util.ArrayList;
import java.util.List;

public class Loadable implements ILoadable {

    List<Load> listLoad;
    int maxLoadSize;

    public Loadable(int maxLoadSize){
        this.maxLoadSize = maxLoadSize;
        listLoad = new ArrayList<>();
    }

    @Override
    public void addItem(Load load) {
        if(listLoad.size() < maxLoadSize){
            listLoad.add(load);
        }
    }

    @Override
    public Load removeItem(Load load) {
        if(!listLoad.isEmpty() && listLoad.contains(load)){
            return listLoad.get(listLoad.indexOf(load));
        }
        return null;
    }
}
