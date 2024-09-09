package main.API;

import java.awt.*;

public class Object {
    private String objectName;
    private Vector position, size;
    private Image texture;
    private boolean initialized = false;
    private int id;

    protected Object(String objectName, Vector position, Vector size, Image texture, int id) {
        this.objectName = objectName;
        this.position = position;
        this.size = size;
        this.texture = texture;
        this.id = id;
    }

    protected Object(String objectName, int id) {
        this.objectName = objectName;
        this.id = id;
    }

    protected Object(String objectName, Vector position, Vector size, int id) {
        this.objectName = objectName;
        this.position = position;
        this.size = size;
        this.texture = null;
        this.id = id;
    }


    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}

