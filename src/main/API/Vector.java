package main.API;

public class Vector {
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
