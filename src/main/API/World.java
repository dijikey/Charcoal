package main.API;

public class World {
    public ObjectList objectList = new ObjectList();

    public void createObject(String objectName) {
        Object el = new Object(objectName, objectList.getObjects().size());
        objectList.addObjects(el);
    }

    public void createObject(String objectName, Vector position, Vector size) {
        Object el = new Object(objectName, position, size, objectList.getObjects().size());
        objectList.addObjects(el);
    }
}
