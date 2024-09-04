package main.API;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Object> objects = new ArrayList<>();

    public List<Object> getObjects() {
        return objects;
    }

    public void addObjects(Object el) {
        this.objects.add(el);
    }

    public void removeObject(Object el){
        this.objects.remove(el);
    }

    public void removeObject(int indexEl){
        this.objects.remove(indexEl);
    }
}
