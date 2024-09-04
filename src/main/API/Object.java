package main.API;

import java.awt.*;

class Object {
    public Vector positon = new Vector(3f, 0f), size;
    public Image texture;
    public boolean initialized;
}

class Vector{
    private float x, y;

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void x(float x){
        this.x = x;
    }
    public float x(){
        return x;
    }

    public void y(float y){
        this.y = y;
    }
    public float y(){
        return y;
    }
}