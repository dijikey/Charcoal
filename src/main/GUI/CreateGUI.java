package main.GUI;

import main.API.World;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static main.GUI.Frame.MAX_SYMBOLS;

class CreateGUI extends JDialog {

    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField objectNameTextField;
    private JTextPane debugPanel;

    public static JPopupMenu popupMenu;

    private static World world;

    public CreateGUI() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        if (objectNameTextField.getText().getBytes().length >= MAX_SYMBOLS) {
            objectNameTextField.setText("");
            debugPanel.setText("The name of the object must not exceed more than %s characters".formatted(MAX_SYMBOLS));
            return;
        }
        world.createObject(objectNameTextField.getText());
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public void init(Point loc, World world) {
        CreateGUI.world = world;
        CreateGUI dialog = new CreateGUI();
        dialog.pack();
        dialog.setLocation(loc);
        dialog.setTitle("Create object: ");
        dialog.setVisible(true);
    }
}
