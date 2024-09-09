package main.GUI;

import main.API.World;

import javax.swing.*;
import javax.swing.tree.TreePath;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

public class Frame extends JFrame{
    private JPanel MainPanel;
    private JList<String> objects;
    private JTree folderVisor;
    private JButton createObject;

    private static World WORLD;

    protected static short MAX_SYMBOLS = 20;

    public Frame(World world){
        WORLD = world;

        setContentPane(MainPanel);

        setTitle("Charcoal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 640);
        setLocationRelativeTo(null);

        createObject();

        try {
            objects.addKeyListener(new KeyListener() {

                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {

                }

                @Override
                public void keyReleased(KeyEvent e) {
                    if (e.getKeyChar() == KeyEvent.VK_DELETE) {
                        world.objectList.removeObject(objects.getAnchorSelectionIndex());
                        updateObjectsList();
                    }
                }
            });
        } catch (Exception e) {
            createRootPane();
        }

        setVisible(true);
    }

    public void updateObjectsList(){
        List<String> OBJECT_LIST = WORLD.objectList.getObjectsNames();
        this.objects.setListData(OBJECT_LIST.toArray(new String[0]));
    }

    private void createObject(){
        createObject.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateGUI gui = new CreateGUI();
                gui.init(getLocation(), WORLD);
                updateObjectsList();
            }
        });
    }
}
