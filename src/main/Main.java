package main;

import main.API.Vector;
import main.API.World;
import main.GUI.BetaFrame;
import main.GUI.Frame;

public class Main {
    static boolean isBeta = false;

    public static void main(String[] args) {
        if (!isBeta){
            World world = new World();
            Frame frame = new Frame(world);

            world.createObject("Camera", new Vector(0f, 0f), new Vector(0, 0));
            world.createObject("World light", new Vector(0f, 0f), new Vector(0, 0));

            frame.updateObjectsList();
        }else {
            new BetaFrame();
        }
    }
}
